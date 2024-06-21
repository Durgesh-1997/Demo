package loops;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  number of Rows");
        int r = sc.nextInt();
        System.out.println("Enter the number columns");
        int c = sc.nextInt();

        // for printing *
        for(int i = 1; i <= r; i++){
            for (int j =1; j<= c; j++){
                System.out.print("*");   //Recta
            }
            System.out.println();
        }


            // for Printing Numbers
        for(int i = 1; i <= r; i++){
            for (int j =1; j<= c; j++){
                System.out.print(j);   //Recta
            }
            System.out.println();
        }
    }
}
