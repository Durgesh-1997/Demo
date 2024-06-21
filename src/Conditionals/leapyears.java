package Conditionals;
import java.util.Scanner;
public class leapyears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number :");
        int n = sc.nextInt();
        if(n%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }

    }
}
