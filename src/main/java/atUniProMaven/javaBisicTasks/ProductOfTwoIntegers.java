package atUniProMaven.javaBisicTasks;
import java.util.Scanner;

public class ProductOfTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first decimal: ");
        double first = scanner.nextDouble();

        System.out.println("Enter the second decimal: ");
        double second = scanner.nextDouble();

        //SUM
        double result1 = first + second;
        System.out.println("The result (SUM) is " + result1);

        //PRODUCT
        double result2 = first * second;
        System.out.println("The result (PRODUCT) is " + result2);

        //DIFFERENCE
        double result3 = first - second;
        System.out.println("The result (DIFFERENCE) is " + result3);

        //DIVISION
        double result4 = first / second;
        System.out.println("The result (DIVISION) is " + result4);

        //remainder
        double result5 = first % second;
        System.out.println("The result (remainder) is " + result5);

        scanner.close();
    }
}
