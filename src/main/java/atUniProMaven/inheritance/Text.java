package atUniProMaven.inheritance;

import java.util.Date;

public class Text extends Info {

  private String author;
  private int date;
  private String message;
  private String messageType;
  boolean copyRightProtected;

  private static final String MYSELF_CREATED = "Post";
  private static final String FORWARDED = "Repost";
  private static final String COMMENT = "Comment";

  public Text(String message, String messageType){
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
    System.out.println("Text - info. Author: " + author
            + "; date: " + date
            + "; message: " + message
            + "; messageType: " + messageType
            + "; copy right: " + copyRightProtected);
  }

  public void isCopyRightProtected(boolean b) {
    if(b) {
      System.out.println("Text is copy right protected");
    } else {
      System.out.println("Text is to be used in any way - no copy right");
    }
  }
}
