package Array;

import java.util.*;

public class Array15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[] arr = new int[n]; //store the n integers in an array
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);//on sorting, same integers will get aligned in consecutive indices
        int i = 0;
        int count = 0;
        while(i < n){
            count++;
            while(i < n-1 && arr[i+1] == arr[i]){//skip duplicates of element
                i++;
            }
            i++; //increment 1 more as i was still pointing to the last duplicate of previous element
        }
        if(count >= m){
            System.out.print(true);
        }else{
            System.out.print(false);
        }
    }
}
