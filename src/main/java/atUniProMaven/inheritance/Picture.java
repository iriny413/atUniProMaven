package atUniProMaven.inheritance;

public class Picture extends Media {

  private int length;
  private int width;
  private int diagonal;


  public Picture(String author, String date, String message, String messageType, int size, int length, int width, int diagonal) {
    super(author, date, message, messageType, size);
    this.length = length;
    this.width = width;
    this.diagonal = diagonal;
  }

  @Override
  java.lang.String maxMessageSizeInMb(int size) {
    return super.maxMessageSizeInMb(size);
  }


  @Override
  void displayContent() {
    super.displayContent();
    System.out.println("Picture's length: " + length + "; width: " + width + "; diagonal: " + diagonal);
  }


  int square(int length, int width) {
    int result = length * width;
    System.out.println("Picture's square: " + result);
    return result;
  }
}
