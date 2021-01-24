package atUniProMaven.inheritance;

public class Main {
  public static void main(String[] args) {

    final Text text1 = new Text("This is a test message", "Comment");
    final Media media1 = new Media();
    final Picture picture1 = new Picture(  5,7);
    final Audio audio1 = new Audio(34, true);
    final Video video1 = new Video(54321, "AVI");

    //Text
    text1.maxMessageSizeInMb(10);
    text1.displayContent();
    text1.isCopyRightProtected(true);

    //Media
    media1.maxMessageSizeInMb(200);
    media1.displayContent();
    media1.isMediaSizeAcceptable(300000);

    //Picture
    picture1.maxMessageSizeInMb(12);
    picture1.displayContent();
    picture1.square(6,6);

    //Audio
    audio1.maxMessageSizeInMb(3000);
    audio1.displayContent();
    audio1.isHighQualityFormat(true);
    audio1.isHighQualityFormat(false);

    //Video
    video1.maxMessageSizeInMb(40000);
    video1.displayContent();
    video1.isVideoFormatAcceptable("AVI");
    video1.isVideoFormatAcceptable("AVI-1");
  }
}
