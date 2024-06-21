package loops;

import java.util.Scanner;

public class RectangularPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  number of Rows");
        int r = sc.nextInt();
        System.out.println("Enter the number columns");
        int c = sc.nextInt();

        for(int i = 1; i <= r; i++){
            for (int j =1; j<= c; j++){
                if (i ==1 || i ==r || j == 1 || j == c){
                    System.out.print("*");   //  hollo Rectangle
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
