package Array;

import java.util.Arrays;

public class ArraOperations1 {
    public static void main(String[] args) {
        int[] array = new int[10]; // Initialize an array of size 10

        // Initialize the array with some values
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }

        // Print the elements of the array
        System.out.println("Array elements:");
        printArray(array);

        // Insert an element at a specific index (index 5 in this case)
        int insertValue = 100;
        int insertIndex = 5;
        array = insertElement(array, insertValue, insertIndex);

        System.out.println("\nArray after inserting " + insertValue + " at index " + insertIndex + ":");
        printArray(array);

        // Delete an element from a specific index (index 3 in this case)
        int deleteIndex = 3;
        array = deleteElement(array, deleteIndex);

        System.out.println("\nArray after deleting element at index " + deleteIndex + ":");
        printArray(array);

        // Search for an element in the array
        int searchValue = 8;
        int searchIndex = searchElement(array, searchValue);
        if (searchIndex != -1) {
            System.out.println("\nElement " + searchValue + " found at index " + searchIndex);
        } else {
            System.out.println("\nElement " + searchValue + " not found in the array");
        }

        // Sort the array
        Arrays.sort(array);
        System.out.println("\nArray after sorting:");
        printArray(array);
    }

    // Method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Method to insert an element into an array at a specific index
    public static int[] insertElement(int[] arr, int value, int index) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == index) {
                newArray[i] = value;
            } else {
                newArray[i] = arr[j++];
            }
        }
        return newArray;
    }

    // Method to delete an element from an array at a specific index
    public static int[] deleteElement(int[] arr, int index) {
        int[] newArray = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArray[j++] = arr[i];
            }
        }
        return newArray;
    }

    // Method to search for an element in an array
    public static int searchElement(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
