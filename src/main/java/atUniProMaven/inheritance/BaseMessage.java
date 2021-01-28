package atUniProMaven.inheritance;

/**
 * Абстрактная запись – абстрактный класс:
 * - поля: автор, дата, сообщение, тип сообщения (запись, репост, комментарий);
 * - методы: отобразить контент – вывод на консоль значения полей;
 * - абстрактный метод, кот. просто возвращает макс. размер записи (мб).
 */
public abstract class BaseMessage {

    private String author;
    private String date;
    private String message;
    private MessageType messageType;

    public BaseMessage(String author, String date, String message, MessageType messageType) {
        this.author = author;
        this.date = date;
        this.message = message;
        this.messageType = messageType;
    }

    public void displayContent() {
        System.out.println("BaseMessage. Author: " + author
                + "; date: " + date
                + "; message: " + message
                + "; messageType: " + messageType);
    }

    public abstract String maxMessageSizeInMb(int size);
}
