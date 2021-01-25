package atUniProMaven.inheritance;

public class Text extends BaseMessage {

  private String author = "FirstName, LastName";
  private String date = "dd.mm.yyyy";
  private String message = "Message to be shown";
  private String messageType = POST;
  boolean copyRightProtected = true;

  private static final String POST = "Post";
  private static final String REPOST = "Repost";
  private static final String COMMENT = "Comment";


  public Text(String message, String messageType) {
    this.message = message;
    this.messageType = messageType;
  }


  @Override
  String maxMessageSizeInMb(int size) {
    String result = size + " Mb";
    System.out.println("Size of text: " + result);
    return result;
  }


  @Override
  void displayContent() {
    super.displayContent();
    System.out.println("Copy right: " + copyRightProtected);
  }


  public void isCopyRightProtected(boolean b) {
    if(b) {
      System.out.println("Text is copy right protected");
    } else {
      System.out.println("Text is to be used in any way - no copy right");
    }
  }
}
