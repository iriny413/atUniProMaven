package atUniProMaven.javaBisicTasks;

import java.util.Scanner;

/**
 * S = π * r2, где r — это радиус, π — это константа,
 * которая выражает отношение длины окружности к диаметру,
 * она всегда равна 3,14.
 */

public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double p = 3.14;

        System.out.println("Enter a decimal value of a radius: ");
        double r = scanner.nextDouble();

        //PRINT THE RESULT
        double r2 = r * r;
        double area = p * r2;
        System.out.println("The area of the circle is " + area);


        double length = 2 * p * r;
        System.out.println("The length of its circumference " + length);
        scanner.close();
    }
}
