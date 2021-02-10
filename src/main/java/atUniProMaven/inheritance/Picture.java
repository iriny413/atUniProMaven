package atUniProMaven.inheritance;

public class Picture extends Media implements PrintInterface {

    private int length;
    private int width;
    private int diagonal;


    public Picture(String author, String date, String message, MessageType messageType, int size, int length, int width, int diagonal) {
        super(author, date, message, messageType, size);
        this.length = length;
        this.width = width;
        this.diagonal = diagonal;
    }

    @Override
    public String maxMessageSizeInMb(int size) {
        return super.maxMessageSizeInMb(size);
    }


    @Override
    public void displayContent() {
        super.displayContent();
        System.out.println("Picture's length: " + length + "; width: " + width + "; diagonal: " + diagonal);
    }


    public int square(int length, int width) {
        int result = length * width;
        System.out.println("Picture's square: " + result);
        return result;
    }

    public void printSomething() {
        System.out.println("Picture");
    }
}
