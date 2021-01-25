package atUniProMaven.inheritance;

public class Audio extends Media {
  private String author = "FirstName, LastName";
  private String date = "dd.mm.yyyy";
  private int size = 0;
  boolean highQualityFormat = false;

  public Audio(int size, boolean highQualityFormat) {
    this.size = size;
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
