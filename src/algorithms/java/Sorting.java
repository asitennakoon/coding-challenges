package algorithms.java;

import java.util.Arrays;

public class Sorting {
    private static final int[] unsortedArray = {9, 5, 1, 3, 7};

    public static void main(String[] args) {
        insertionSort();
    }

    // TODO: Merge Sort

    public static void insertionSort() {
        System.out.println("Before Sorting: " + Arrays.toString(unsortedArray));

        for (int i = 1; i < unsortedArray.length; i++) {
            int temp = unsortedArray[i];
            for (int j = i - 1; j >= 0; j--) {
                if (unsortedArray[j] > temp) {
                    unsortedArray[j + 1] = unsortedArray[j];
                    unsortedArray[j] = temp;
                } else {
                    break;
                }
            }
        }

        System.out.println("\nAfter Sorting: " + Arrays.toString(unsortedArray));
    }

    public static void selectionSort() {
        System.out.println("Before Sorting: " + Arrays.toString(unsortedArray));

        for (int i = 0; i < unsortedArray.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i; j < unsortedArray.length; j++) {
                if (unsortedArray[j] < unsortedArray[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            int temp = unsortedArray[i];
            unsortedArray[i] = unsortedArray[smallestIndex];
            unsortedArray[smallestIndex] = temp;
        }

        System.out.println("\nAfter Sorting: " + Arrays.toString(unsortedArray));
    }

    public static void bubbleSort() {
        System.out.println("Before Sorting: " + Arrays.toString(unsortedArray));

        for (int i = 0; i < unsortedArray.length - 1; i++) {
            for (int j = 0; j < unsortedArray.length - 1 - i; j++) {
                if ((unsortedArray[j]) > unsortedArray[j + 1]) {
                    int temp = unsortedArray[j + 1];
                    unsortedArray[j + 1] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }

        System.out.println("\nAfter Sorting: " + Arrays.toString(unsortedArray));
    }
}