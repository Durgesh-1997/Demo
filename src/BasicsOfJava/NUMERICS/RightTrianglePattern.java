package BasicsOfJava.NUMERICS;

import java.util.Scanner;

public class RightTrianglePattern {

    public static void main(String[] args) {
        int i, j, rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print: ");
        rows = sc.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
