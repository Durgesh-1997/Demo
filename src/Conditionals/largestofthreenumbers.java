package Conditionals;
import java.util.Scanner;
public class largestofthreenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first number : ");
        int a = sc.nextInt();
        System.out.println(" Enter second  number : ");
        int b = sc.nextInt();
        System.out.println(" Enter third number : ");
        int c = sc.nextInt();
//        if(a>b && a>c){
//            System.out.println(a+" is largest");
//        }
//        if(b>a && b>c){
//            System.out.println(b+" is largest");
//        }
//        if(c>a &&c>b){
//            System.out.println(c+" is largest");
//        }
        if(a>b && a>c){  //a is max
            System.out.println(a+" is largest");
        }
        else if(b>a && b>c){  // b is max
            System.out.println(b+" is largest");
        }
        else if(c>a &&c>b){  //c has to be the largest
            System.out.println(c+" is largest");
        }




    }
}
