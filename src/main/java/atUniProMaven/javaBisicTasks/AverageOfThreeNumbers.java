package atUniProMaven.javaBisicTasks;

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first decimal: ");
        double first = scanner.nextDouble();

        System.out.println("Enter the second decimal: ");
        double second = scanner.nextDouble();

        System.out.println("Enter the third decimal: ");
        double third = scanner.nextDouble();

        //AVERAGE
        double result1 = (first + second + third)/ 3;
        System.out.println("The result (average) is " + result1);

        scanner.close();
    }
}
