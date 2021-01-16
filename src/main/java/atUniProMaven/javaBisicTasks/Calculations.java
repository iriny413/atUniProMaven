package atUniProMaven.javaBisicTasks;

public class Calculations {
    public static void main(String[] args) {
        String given1 = "'-5 + 8 * 6 '";
        int result1 = -5 + 8 * 6;
        System.out.println("Дано: " + given1 + "Результат: " + result1);


        String given2 = "'55 + 9 % 9 '";
        int result2 = (55 + 9) % 9;
        System.out.println("Дано: " + given2 + "Результат: " + result2);

        String given3 = "'\t20 + (-3) * 5 / 8 '";
        double result3 = 20 + -3 * 5 / 8;
        System.out.println("Дано: " + given3 + "Результат: " + result3);

        String given4 = "'5 + 15 / 3 * 2 – 8 % 3 '";
        double result4 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("Дано: " + given4 + "Результат: " + result4);
    }
}
