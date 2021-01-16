package atUniProMaven.controlStatement;
import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first integer: ");
        int first = scanner.nextInt();

        System.out.print("Input the second integer: ");
        int second = scanner.nextInt();

        // Equality check
        if (first == second) {
            System.out.println(first + " == " + second);
        } else {
            System.out.println(first + " != " + second);
        }

        // More or less check
        if (first > second) {
            System.out.println(first + " > " + second);
        } else if (first < second) {
            System.out.println(first + " < " + second);
        } else {
            System.out.println(first + " == " + second);
        }

        // More or equal or less or equal check
        if (first >= second) {
            System.out.println(first + " >= " + second);
        } else {
            System.out.println(first + " <= " + second);
        }
    }
}
