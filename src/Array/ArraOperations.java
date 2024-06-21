package Array;

import java.util.Arrays;

public class ArraOperations {

    public static void main(String[] args) {
        int[] arr = {5, 10, 3, 8, 15, 7}; // Initialize array

        // Print original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Accessing elements
        System.out.println("Element at index 2: " + arr[2]);

        // Updating elements
        arr[3] = 20;
        System.out.println("Updated Array after changing element at index 3: " + Arrays.toString(arr));

        // Finding maximum element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);

        // Finding minimum element
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element: " + min);

        // Calculating sum and average
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);

        // Searching for an element
        int searchKey = 15;
        boolean found = false;
        for (int num : arr) {
            if (num == searchKey) {
                found = true;
                break;
            }
        }
        System.out.println("Is " + searchKey + " present in the array? " + found);

        // Sorting the array
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Reversing the array
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
