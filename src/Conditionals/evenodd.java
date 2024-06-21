package Conditionals;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number : ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(" The Number you Entered Is Even ");
        }
        if(n%2!=0){
            System.out.println(" The number you entered is odd ");

        }
    }
}
