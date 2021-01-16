package atUniProMaven.javaBisicTasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProductOf2Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first interger: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int second = scanner.nextInt();

        int result = first * second;
        System.out.println(first + " x " + second + "==" + result);

        scanner.close();
    }
}
