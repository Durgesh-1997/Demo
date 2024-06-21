package Array;

import java.util.*;

public class Array18 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = scn.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++){
            numbers[i] = scn.nextInt();
        }
        System.out.println("Enter the target");
        int target = scn.nextInt();
        int i = 0;
        int j = n-1;
        while(i < j){
            if(numbers[i] + numbers[j] == target){
                System.out.println(++i + " " + ++j);
                return;
            }else if(numbers[i] + numbers[j] > target){
                j--;
            }else{
                i++;
            }
        }
        System.out.println(-1);
    }
}
