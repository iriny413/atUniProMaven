package atUniProMaven.inheritance;

public class Audio extends Media implements PlayInterface {

  boolean highQualityFormat;


    public Audio(String author, String date, String message, Dictionary.MessageType messageType, int size, boolean highQualityFormat) {
    super(author, date, message, messageType, size);
    this.highQualityFormat = highQualityFormat;
  }


  @Override
  public String maxMessageSizeInMb(int size) {
    String result = size + " Mb";
    System.out.println("Size of audio: " + result);
    return result;
  }

  @Override
  public void displayContent() {
    super.displayContent();
    System.out.println("High Quality Format: " + highQualityFormat);
  }

  public void isHighQualityFormat(boolean value) {
    if(value) {
      System.out.println("Audio format is high quality");
    } else {
      System.out.println("Audio format is not high quality");
    }
  }

    public void playSomething() {
        System.out.println("This audio is playing now");
    }
}
