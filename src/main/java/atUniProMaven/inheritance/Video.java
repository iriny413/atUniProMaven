package atUniProMaven.inheritance;

public class Video extends Media {
  String author;
  int size;
  String format;

  public Video(int size, String format){
    this.size = size;
    this.format = format;
  }

  @Override
  String maxMessageSizeInMb(int size) {
    return super.maxMessageSizeInMb(size);
  }

  @Override
  void displayContent() {
    super.displayContent();
    System.out.println("Size: " + size);
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
