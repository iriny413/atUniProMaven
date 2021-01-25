package atUniProMaven.inheritance;

/**
 * Абстрактная запись – абстрактный класс:
 * - поля: автор, дата, сообщение, тип сообщения (запись, репост, комментарий);
 * - методы: отобразить контент – вывод на консоль значения полей;
 * - абстрактный метод, кот. просто возвращает макс. размер записи (мб).
 */
public abstract class BaseMessage {

  private String author = "Max, Mustermann";
  private String date = "01.12.2010";
  private String message = "Message to be shown";
  private String messageType = POST;

  private static final String POST = "Post";
  private static final String REPOST = "Repost";
  private static final String COMMENT = "Comment";

  public BaseMessage(String author, String date, String message, String messageType) {
    this.author = author;
    this.date = date;
    this.message = message;
    this.messageType = messageType;
  }

  void displayContent() {
    System.out.println("BaseMessage. Author: " + author
            + "; date: " + date
            + "; message: " + message
            + "; messageType: " + messageType);
  }

  abstract String maxMessageSizeInMb(int size);
}
