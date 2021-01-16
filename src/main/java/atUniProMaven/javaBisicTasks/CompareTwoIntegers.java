package atUniProMaven.javaBisicTasks;

import java.util.Scanner;

public class CompareTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first interger: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int second = scanner.nextInt();

        int max = first;

        if (second > max){
            max = second;
        }

        int result = max;
        System.out.print("The maximum int is: " + result);

        scanner.close();
    }
}
