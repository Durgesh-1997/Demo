package Array;

import java.util.Scanner;

public class ArrayMatrix26 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the dimensions of the array: ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        for (int x = 0; x < n / 2; x++) {
            for (int y = x; y < n - x - 1; y++) {
                // Store current cell in temp variable
                int temp = mat[x][y];
                // Move values from right to top
                mat[x][y] = mat[y][n - 1 - x];
                // Move values from bottom to right
                mat[y][n - 1 - x] = mat[n - 1 - x][n - 1 - y];
                // Move values from left to bottom
                mat[n - 1 - x][n - 1 - y] = mat[n - 1 - y][x];
                // Assign temp to left
                mat[n - 1 - y][x] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

}
