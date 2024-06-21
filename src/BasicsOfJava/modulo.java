package BasicsOfJava;
import java.util.Scanner;
public class modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend :  ");
        int a = sc.nextInt();
        System.out.println("Enter Divisor : ");
        int b = sc.nextInt();
//        int q = a/b;
//        int r = a%b;
//        System.out.println("The remainder When "+a+" is devided by " +b+ " is "+r);

        int r = a % b;
        System.out.println("Remainder");
        System.out.println(r);
    }
}
