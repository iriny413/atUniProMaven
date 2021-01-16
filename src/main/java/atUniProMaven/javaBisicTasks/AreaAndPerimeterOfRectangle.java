package atUniProMaven.javaBisicTasks;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first decimal: ");
        double first = scanner.nextDouble();

        System.out.println("Enter the second decimal: ");
        double second = scanner.nextDouble();

        //Area
        double result1 = (first * second);
        System.out.println("The result (area of rectangle) is " + result1);

        //PERIMETER
        double result2 = (first * 2 + second *2);
        System.out.println("The result (average) is " + result2);

        scanner.close();
    }
}
