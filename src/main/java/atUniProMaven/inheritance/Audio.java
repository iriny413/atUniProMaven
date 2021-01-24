package atUniProMaven.inheritance;

public class Audio extends Media {
  String author;
  int date;
  int size;
  boolean highQualityFormat;

  public Audio(int size, boolean highQualityFormat){
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
    System.out.println("Size: " + size);
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
