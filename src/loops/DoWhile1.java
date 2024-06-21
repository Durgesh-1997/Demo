package loops;

import java.util.Scanner;

public class DoWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int sum =0;


        do {
            sum += num;
            num = sc.nextInt();
        } while (num != -1);
        System.out.println(sum);



        while (num != -1){
            sum += num;
            num = sc.nextInt();
        }
        System.out.println(sum);


    }
}
