package Array;

import java.util.*;

public class Array13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the value of X ");
        int x = scn.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){ //check for pair with all elements 1 by 1
                if(arr[j] - arr[i]== x){
                    System.out.print("Yes");
                    return;
                }
            }
        }
        System.out.print("No");
    }
}


//OutPut:
//arr[i]={1,2,3,4,5};
//arr[j]= {1,2,3,4,5,};
//x=1;
//arr[j+1]-arr[i]==x;
//2-1==1;

