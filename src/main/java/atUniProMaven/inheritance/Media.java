package atUniProMaven.inheritance;

public class Media extends BaseMessage {

  private int size = 0;

  private static final String POST = "Post";
  private static final String REPOST = "Repost";
  private static final String COMMENT = "Comment";

  public Media(String author, String date, String message, String messageType, int size) {
    super(author, date, message, messageType);
    this.size = size;
  }

  @Override
  String maxMessageSizeInMb(int size) {
    String result = size + " Mb";
    System.out.println("Size of media message in Mb: " + result);
    return result;
  }

  @Override
  void displayContent() {
    super.displayContent();
    System.out.println("Size of media message: " + size);
  }

  boolean isMediaSizeAcceptable(int size) {
    boolean result;
    if(size < 10000) {
      System.out.println("Media size is acceptable");
      result = true;
    } else {
      System.out.println("Media size is not acceptable");
      result = false;
    }
    return result;
  }
}