package Array;

import java.util.Scanner;
//1 D to convert in 2D array
public class Array2D21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the dimensions of 2d array you want to convert to: ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr = new int[m*n];
        int[][] mat = new int[n][m];
        System.out.println("Enter the elements of 1D array: ");
        for(int i = 0; i < m*n; i++){
            arr[i] = scn.nextInt();
        }
        int idx = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = arr[idx];
                idx++;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}

//input:
// Enter the dimensions of 2d array you want to convert to:
//2
//3
//Enter the elements of 1D array:
//1
//2
//3
//4
//5
//6
//Output:
// 1 2 3
//4 5 6