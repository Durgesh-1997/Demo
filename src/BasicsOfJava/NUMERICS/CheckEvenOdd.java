package BasicsOfJava.NUMERICS;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + evenOdd);
    }
}
