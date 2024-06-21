package BasicsOfJava;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Ente the First Value: ");
        int a = sc.nextInt();  //10

        System.out.println("Enter The Second Value: ");
        int b = sc.nextInt(); //15

        System.out.println(a == b); // false
        System.out.println(a != b); //true
        System.out.println(a <= b); //true
        System.out.println(a >= b); //false
        System.out.println(a < b); //true
        System.out.println(a > b); //false
    }
}
