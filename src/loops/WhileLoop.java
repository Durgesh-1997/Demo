package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int num = 1;

        while (num <= n){
            System.out.println(num);
            num++;  //incremental operator  ++ , num = num + 1
        }

        int sum = 0;
        int num1 = 1;
        while(num1 <= n){
            sum = sum + num1;
            num1++;
        }
        System.out.println(sum);

    }
}
