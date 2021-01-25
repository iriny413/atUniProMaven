package atUniProMaven.inheritance;

public class Audio extends Media {

  boolean highQualityFormat = false;


  public Audio(String author, String date, String message, String messageType, int size, boolean highQualityFormat) {
    super(author, date, message, messageType, size);
    this.highQualityFormat = highQualityFormat;
  }


  @Override
  String maxMessageSizeInMb(int size) {
    String result = size + " Mb";
    System.out.println("Size of audio: " + result);
    return result;
  }

  @Override
  void displayContent() {
    super.displayContent();
    System.out.println("High Quality Format: " + highQualityFormat);
  }

  void isHighQualityFormat(boolean value) {
    if(value) {
      System.out.println("Audio format is high quality");
    } else {
      System.out.println("Audio format is not high quality");
    }
  }
}
