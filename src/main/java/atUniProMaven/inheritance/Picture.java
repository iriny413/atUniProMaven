package atUniProMaven.inheritance;

public class Picture extends Media {
  private String author = "FirstName, LastName";
  private String date = "dd.mm.yyyy";
  private int size = 0;
  private int length;
  private int width;
  private int diagonal;


  public Picture(int length, int width, int size) {
    this.length = length;
    this.width = width;
    this.size = size;
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
