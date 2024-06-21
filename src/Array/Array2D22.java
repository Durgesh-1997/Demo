package Array;

import java.util.Scanner;
//sum of matrix elements for the give range
public class Array2D22 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the dimensions of the 2d array: ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        System.out.println("Enter the range of rows: ");
        int srow = scn.nextInt();// range starting row
        int erow = scn.nextInt();//range ending row
        System.out.println("Enter the range of columns: ");
        int scol = scn.nextInt();// range starting column
        int ecol = scn.nextInt();//range ending column
        int sum = 0;
        while(srow <= erow){
            int j = scol;
            while(j <= ecol){
                sum += mat[srow][j];
                j++;
            }
            srow++;
        }
        System.out.println(sum);
    }
}

//input:
// Enter the dimensions of the 2d array:
//3
//3
//Enter the elements of the array:
//1
//2
//3
//4
//5
//6
//7
//8
//9
//Enter the range of rows:
//1
//2
//Enter the range of columns:
//1
//2
//Output:
// 28