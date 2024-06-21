package BasicsOfJava;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int num = sc.nextInt();
//
//            String ans;
//            ans = (num % 2 ==0) ? "even": "odd";
//        System.out.println(ans);



        int x=7,b1=3,c=5;
        int res = x<b1 ? x>c ? x:c:b1;
        System.out.println(res);
    }
}
