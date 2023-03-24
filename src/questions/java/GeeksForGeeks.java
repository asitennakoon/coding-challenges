package questions.java;

import java.util.Arrays;

public class GeeksForGeeks {
    private static final int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        reverseArray(array);
    }

    public static void reverseArray(int[] array) {
        System.out.println("Original Array: " + Arrays.toString(array));
/*        // Using a temporary array
        int[] tempArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[array.length - 1 - i];
        }

        System.out.println("Reversed Array: " + Arrays.toString(tempArray));*/

        // Swapping indexes
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = array[i] + array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
            array[i] = array[i] - array[array.length - 1 - i];
        }

        System.out.println("\nReversed Array: " + Arrays.toString(array));
    }

    public static void swapTwoNumbers(int a, String b) {
        int x = 5;
        int y = 7;
        System.out.printf("Before Swapping: X = %d, Y = %d", x, y);

        // Using a temporary variable (Not recommended)
        int temp = x;
        x = y;
        y = temp;
        System.out.printf("%nAfter Swapping: X = %d, Y = %d", x, y);

        // Without using a temp var
        x = 5;
        y = 7;

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.printf("%nAfter Swapping: X = %d, Y = %d", x, y);
    }
}