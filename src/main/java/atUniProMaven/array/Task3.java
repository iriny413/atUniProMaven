package atUniProMaven.array;

/**
 * 3.	Find a sum of all even positive numbers of an array
 * Input array: [18, -5, 6, 33, 8, 45, 0, -2, 111]
 * The result: 32
 */

public class Task3 {
    public static void main(String[] args) {
        int abc[] = {18, -5, 6, 33, 8, 45, 3, -112, 111};
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            if (abc[i] > 0 && abc[i] % 2 == 0) {
                sum = sum + abc[i];
            }
        }
        System.out.println ("Result: " + sum);
    }
}
