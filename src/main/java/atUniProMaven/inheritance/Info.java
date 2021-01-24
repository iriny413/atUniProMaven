package atUniProMaven.inheritance;

import java.util.Date;

/**
 * Абстрактная запись – абстрактный класс:
 * - поля: автор, дата, сообщение, тип сообщения (запись, репост, комментарий);
 * - методы: отобразить контент – вывод на консоль значения полей;
 * - абстрактный метод, кот. просто возвращает макс. размер записи (мб).
 */
public abstract class Info {

  private String author;
  private Date date;
  private String message;
  private String messageType;

  void displayContent() {
    System.out.println("Information:");
  }

  abstract String maxMessageSizeInMb(int size);
}
