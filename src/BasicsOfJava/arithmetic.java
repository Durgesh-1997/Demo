package BasicsOfJava;
import java.sql.SQLOutput;
import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        int x=sc.nextInt();
        int y=sc.nextInt();

//        System.out.println(x+y);
//        System.out.println(x-y);
//        System.out.println(x*y);
//        System.out.println(x/y);
        System.out.println(x%y);
//        System.out.println(y%x);
    }
}
