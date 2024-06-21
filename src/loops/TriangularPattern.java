package loops;
import java.util.*;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int i,j;

        // for * pattern Right Angle
        for( i = 1;i <= n; i++){
            for( j = 1; j <= i; j++){

                System.out.print("*");
            }
            System.out.println();
        }

        // for number pattern
        for( i = 1;i <= n; i++){
            for( j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();





        }


        // for * pattern Right Angle
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


        for( i = 0;i <= n; i++){
            for( j = n-i; j >=0; j--){
                System.out.print("*");

            }
            System.out.println();
        }

        for( i = 0;i <= n; i++){
            for( j =0; j<n; j++){
            if (i==0 || j==n-1&& i!=n){
                System.out.print("*");
            }
            }
        }


    }



    }
