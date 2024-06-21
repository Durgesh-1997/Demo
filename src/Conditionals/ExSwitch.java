package Conditionals;

import java.util.Scanner;
public class ExSwitch {
    public static void main(String[] args) {
        int day;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number(1 for weekday 2 for weekend): ");
        day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Weekday");
                break;
            case 2:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("not matched");
                break;
        }
    }
}

//import java.util.Scanner;
//
//public class Conditionals.ExSwitch {
//    public static void main(String[] args) {
//        int day;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("please enter number");
//        day = sc.nextInt();
//        switch (day) {
//            case 1:
//                System.out.println("Weekday");
//                break;
//            case 2:
//                System.out.println("Weekend");
//                break;
//
//            default:
//                System.out.println("Regular");
//                break;
//        }
//    }
//}