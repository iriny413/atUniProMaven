package atUniProMaven.javaBisicTasks;

import java.util.Scanner;

public class BiggestIntOutOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first interger: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int second = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int third = scanner.nextInt();

        int max = first;

        if (second > max){
            max = second;
        }

        if (third > max){
            max = third;
        }

        int result = max;
        System.out.print("The maximum int is: " + result);

        scanner.close();
    }
}
