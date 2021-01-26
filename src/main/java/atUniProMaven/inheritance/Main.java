package atUniProMaven.inheritance;

import static atUniProMaven.inheritance.Dictionary.MessageType.*;

public class Main {
  public static void main(String[] args) {

    final Text text1 = new Text("Mary Key", "01.01.2020", "This is a new text about fast cars", POST, false);
    final Media media1 = new Media("Gary Key", "02.01.2020", "This is a new media", REPOST, 200);
      final Picture picture1 = new Picture("Tom Key", "03.01.2020", "This is a picture", COMMENT, 300, 2, 4, 6);
      final Audio audio1 = new Audio("Max Key", "04.01.2020", "This is an audio", POST, 400, true);
      final Video video1 = new Video("Kate Key", "05.01.2020", "This is a video", COMMENT, 500, "AVI");

    //Text
    text1.maxMessageSizeInMb(10);
    text1.displayContent();
    text1.isCopyRightProtected(true);
      text1.printSomething();

    //Media
    media1.maxMessageSizeInMb(200);
    media1.displayContent();
    media1.isMediaSizeAcceptable(300000);

    //Picture
    picture1.maxMessageSizeInMb(12);
    picture1.displayContent();
    picture1.square(6, 6);
      picture1.printSomething();

    //Audio
    audio1.maxMessageSizeInMb(3000);
    audio1.displayContent();
    audio1.isHighQualityFormat(true);
    audio1.isHighQualityFormat(false);
      audio1.playSomething();

    //Video
    video1.maxMessageSizeInMb(40000);
    video1.displayContent();
    video1.isVideoFormatAcceptable("AVI");
    video1.isVideoFormatAcceptable("AVI-1");
      video1.playSomething();
  }
}
