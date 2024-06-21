package loops;

import java.util.Scanner;

public class SumForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        for (int num = n; num >= 1; num -=2){      //  first time solving method num -= 2, num = num - 2
            System.out.println(num);
        }

//        int num1 = n;
//        for (; num1 >= 1;){      //  second type solving method num -= 2, num = num - 2
//            System.out.println(num1);
//            num1 -= 2;
//        }




        int sum = 0;

        for (int num = 1; num <= n; num++){
            sum = sum + num;
        }
        System.out.println("Sum of number: " + sum);
    }
}
