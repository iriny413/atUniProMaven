package atUniProMaven.inheritance;

public class Video extends Media implements PlayInterface {

  private String format;

    public Video(String author, String date, String message, Dictionary.MessageType messageType, int size, String format) {
    super(author, date, message, messageType, size);
    this.format = format;
  }

  @Override
  public String maxMessageSizeInMb(int size) {
    return super.maxMessageSizeInMb(size);
  }

  @Override
  public void displayContent() {
    super.displayContent();
    System.out.println("Video format: " + format);
  }

  public boolean isVideoFormatAcceptable(String format) {
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

    public void playSomething() {
        System.out.println("This video is playing now");
    }
}
