package atUniProMaven.inheritance;

public class Video extends Media {

  private String format;

  public Video(String author, String date, String message, String messageType, int size, String format) {
    super(author, date, message, messageType, size);
    this.format = format;
  }

  @Override
  String maxMessageSizeInMb(int size) {
    return super.maxMessageSizeInMb(size);
  }

  @Override
  void displayContent() {
    super.displayContent();
    System.out.println("Video format: " + format);
  }

  boolean isVideoFormatAcceptable(String format) {
    boolean result;
    if(format.equals("MP4") || format.equals("AVI")) {
      System.out.println("Video format is acceptable");
      result = true;
    } else {
      System.out.println("Video format is not acceptable");
      result = false;
    }
    return result;
  }
}
