package BasicsOfJava;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float num = sc.nextFloat();
//        int num1= sc.nextInt();
//        System.out.println(num);
//        System.out.println(num1);

        //Type casting
//        int num = (int)(67.56f);
//        System.out.println(num);

        //automatic type casting promotionin expressions
//        int a = 257;
//        byte b = (byte)(a);
//
//        System.out.println(b);

//        byte a = 40;
//        byte b= 50;
//        byte c = 100;
//        int d = (a * b)/c;
//        System.out.println(d);

//        int number = 'A';
//        System.out.println(number);
//        System.out.println(3*6.5522525455654f);


        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i/c) - (d * s);
        System.out.println((f * b) + " " + (i/c) + " " + (d * s));
        System.out.println(result);

    }
}
