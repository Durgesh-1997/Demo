package BasicsOfJava;
import java.util.*;
//public class basics {
//    public static void main(String[] args) {
//        System.out.println("Hello PW");
//        System.out.println("Hello Durgesh");
//        System.out.println("Hello Sachin");
//        System.out.print("UPSC WALLAH");
//        System.out.print("  SSC WALLAH");
//
//    }
//}




// class basics{
//    public static void main(String[] args)
//    {
//
//        int i;
//
//        int arr[] = {5};
//
//        for (i = 0; i < 5; i++)
//
//            System.out.println(arr[i]);
//
//    }
//}


//class basics
//
//{
//
//    public static void main(String args[])
//
//    {
//
//        char array_variable [] = new char[10];
//
//        for (int i = 0; i < 10; ++i)
//
//        {
//
//            array_variable[i] = 'i';
//
//            System.out.print(array_variable[i]);
//
//        }
//
//    }
//
//}


//class basics{
//    public static void main(String[] args) {
//        int num;
//
//        // Input the integer
//        System.out.println("Enter the integer: ");
//
//        // Create Scanner object
//        Scanner s = new Scanner(System.in);
//
//        // Read the next integer from the screen
//        num = s.nextInt();
//
//        // Display the integer
//        System.out.println("Entered integer is: "
//                + num);
//    }
//}



// Java program to demonstrate BufferedReader

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//public class basics {
//    public static void main(String[] args)
//            throws IOException
//    {
//        // Enter data using BufferReader
//        BufferedReader reader = new BufferedReader(
//                new InputStreamReader(System.in));
//
//        // Reading data using readLine
//        String name = reader.readLine();
//
//        // Printing the read line
//        System.out.println(name);
//    }
//}


public class basics{
    public static void main(String args[]){
        String str = "Hello World";
        String anotherString = "hello world";
        Object objStr = str;

        System.out.println( str.compareTo(anotherString) );//32
        System.out.println( str.compareToIgnoreCase(anotherString) );//0
        System.out.println( str.compareTo(objStr.toString()));//0
    }
}



