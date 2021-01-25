package atUniProMaven.inheritance;

/**
 * Абстрактная запись – абстрактный класс:
 * - поля: автор, дата, сообщение, тип сообщения (запись, репост, комментарий);
 * - методы: отобразить контент – вывод на консоль значения полей;
 * - абстрактный метод, кот. просто возвращает макс. размер записи (мб).
 */
public abstract class BaseMessage {

  private String author = "FirstName, LastName";
  private String date = "dd.mm.yyyy";
  private String message = "Message to be shown";
  private String messageType = POST;

  private static final String POST = "Post";
  private static final String REPOST = "Repost";
  private static final String COMMENT = "Comment";

  void displayContent() {
    System.out.println("BaseMessage. Author: " + author
            + "; date: " + date
            + "; message: " + message
            + "; messageType: " + messageType);
  }

  abstract String maxMessageSizeInMb(int size);
}
