package BasicsOfJava.NUMERICS;

import java.util.Scanner;

public class LeftTrianglePattern {
    public static void main(String[] args) {
        int i,j;
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            // Loop to print spaces
            for (j = 2 * (n - i ); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }



        for (i = 1; i <= n; i++) {
            // Loop to print spaces
            for (j =  (n - i ); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
