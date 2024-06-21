package BasicsOfJava;
import java.util.Scanner;
public class areaOfACircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Radius : ");
//        double r = 5;
        double r = sc.nextInt();
        double pi = 3.14;
        double area = pi * r * r ;
        System.out.println(" The area of circle is : "+area);

    }
}
