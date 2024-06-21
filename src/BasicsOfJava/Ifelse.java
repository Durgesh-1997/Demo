package BasicsOfJava;

import java.util.Scanner;

//public class Ifelse {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number: ");
//        int num = sc.nextInt();
//        //if - else is statement
//        if(num % 2 == 0){
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }
//
//        if(num % 5 == 0 && num % 3 == 0){
//            System.out.println("Found ans - " + num);
//        }
//
//        if(num % 5 == 0 || num % 3 == 0){
//            System.out.println("Found ans - " + num);
//        }
//    }
//}



public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary: ");
        int salary = sc.nextInt();
        //if - else is statement
//        if (salary>10000){
//            salary = salary +2000;
//        }else {
//            salary = salary +1000;
//        }
//
//        System.out.println(salary);


        //multipal if-else

        if(salary > 10000){
            salary += 2000;//salary = salary +2000
        } else if (salary > 20000) {
            salary += 3000;
        }else {
            salary += 1000;
        }
        System.out.println(salary);
    }
}