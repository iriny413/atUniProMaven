package atUniProMaven.inheritance;

import com.sun.org.apache.xpath.internal.operations.String;

public class Picture extends Media {
  String author;
  int date;
  int length;
  int width;
  int diagonal;

  public Picture(int length, int width){
    this.length = length;
    this.width = width;
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
