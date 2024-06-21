package BasicsOfJava;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //

        //Taking String input
        System.out.println("Enter your lucky name");
        String name = sc.next();    //for single word
//        String name = sc.nextLine();   //for whole Line
        System.out.println("Name is " + name);

        //Taking integer input
        System.out.println("Enter your lucky number");
        int num_1 = sc.nextInt();
        System.out.println("Number is " + num_1);
    }
}
