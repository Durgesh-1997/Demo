package Conditionals;
import java.util.Scanner;
public class threedegitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println(" This is a 3 digit number");
        }
        else{
            System.out.println(" It is not a 3 digit number");
        }
    }
}

