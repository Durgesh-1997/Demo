package Conditionals;

import java.util.Scanner;

public class divisiblebythreeorfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0){
            System.out.println(" The number is devisible by 3 or 5 ");
        }
        else{
            System.out.println(" Not divisible by 3 or 5 ");
        }



    }
}
