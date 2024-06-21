package Array;

import java.util.*;

public class Array6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter values");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter K value");
        int k = scn.nextInt();
        // Arrays.sort(arr);//
        System.out.print(arr[k-1]);
        System.out.println();
    }
}

//
//Solution:
//        Input: Enter the length of array:
//        5
//        Enter values
//        0
//        1
//        2
//        3
//        4
//        Enter K value
//        2
//     Output:    1
