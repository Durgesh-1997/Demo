package Array;

import java.util.Scanner;

public class ArraysInput {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];


        System.out.println("Enter array element");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }


         
         int[] arr_2 = arr;
        for(int i = 0; i<n; i++) {
            System.out.println(arr_2[i] + " ");
        }

    }
}
