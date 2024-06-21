package Array;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array values");
        for(int i = 0; i < n; i++){

            arr[i] = scn.nextInt();
        }
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j < n){
            sum += arr[j];
            if(sum > target){
                while(sum > target && i < j){
                    sum -= arr[i];
                    i++;
                }
            }
            if(sum == target){
                System.out.print(i + " ");
                System.out.print(j);
                break;
            }
            j++;
        }
    }
}
//    Dry Run:
//    Given the inputs 5, 12, and array values 1, 2, 3, 4, 5, the program will operate as follows:
//
//        Initially, i = 0, j = 0, sum = 0.
//        j increments from 0 to 4 while summing array elements:
//        When j = 3 (arr[3] = 4), sum = 10.
//        Increment j to 4, now sum = 15 (1+2+3+4+5), which is greater than 12.
//        Start subtracting from the beginning (i = 0 onwards) until sum <= 12. After subtracting 1 and 2 (i = 2), sum = 12.
//        The condition if(sum == s) becomes true, and it prints 2 4, indicating that the subarray starting at index 2 and ending at index 4 (3, 4, 5) sums to 12.
//        The program then exits the loop.

//OutPut is : 2 4 indicating that the subarray starting at index 2 and ending at index 4 (3, 4, 5) sums to 12.