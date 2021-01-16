package atUniProMaven.controlStatement;
import java.util.Scanner;

public class PrintMiddleNumOutOf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first integer: ");
        int first = scanner.nextInt();

        System.out.print("Input the second integer: ");
        int second = scanner.nextInt();

        System.out.print("Input the third integer: ");
        int third = scanner.nextInt();

        if (first >= second && first <= third
                || first <= second && first >= third) {
            System.out.println("The middle number is " + first);
        } else if (second >= first && second <= third
                || second <= first && second >= third) {
            System.out.println("The middle number is " + second);
        } else {
            System.out.println("The middle number is " + third);
        }
    }
}