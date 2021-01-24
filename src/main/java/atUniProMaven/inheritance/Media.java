package atUniProMaven.inheritance;

public class Media extends Info {
  private String author;
  int date;
  private String message;
  private String messageType;
  private int size;

  private static final String MYSELF_CREATED = "Post";
  private static final String FORWARDED = "Repost";
  private static final String COMMENT = "Comment";

  @Override
  String maxMessageSizeInMb(int size) {
    String result = size + " Mb";
    System.out.println("Size of media: " + result);
    return result;
  }

  @Override
  void displayContent() {
    System.out.println("Media - info. Author: " + author
            + "; message: " + message
            + "; messageType: " + messageType);
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