package atUniProMaven.controlStatement;

import java.util.Scanner;

/**
 * 3.	Write a program to print the odd numbers from 1 to 99.
 * Prints one number per line
 */

public class PrintOddNumbers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Inter the first integer: ");
        int n1 = 1;

        while (n1 < 100) {
            if (n1 % 2 == 1) {
                System.out.println(n1);
            }
            n1 = s.nextInt();
        }
    }
}
