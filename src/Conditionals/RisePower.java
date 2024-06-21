package Conditionals;

import java.util.Scanner;

public class RisePower {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number ");
        int a = sc.nextInt(), b = sc.nextInt();

        int ans = 1;
        for(int i = 1; i<=b; i++){
            ans *= a;
        }
        System.out.println(ans);
    }
}
