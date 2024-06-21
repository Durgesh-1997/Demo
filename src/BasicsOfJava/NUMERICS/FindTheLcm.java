package BasicsOfJava.NUMERICS;
import java.io.*;
public class FindTheLcm {
    // Java Program to find
// the LCM of two numbers


    // Driver Class

        // main function
        public static void main(String[] args)
        {
            // Numbers
            int a = 15, b = 25;

            // Checking for the smaller
            // Number between them
            int ans = (a > b) ? a : b;

            // Checking for a smallest number that
            // can de divided by both numbers
            while (true) {
                if (ans % a == 0 && ans % b == 0)
                    break;
                ans++;
            }

            // Printing the Result
            System.out.println("LCM of " + a + " and " + b
                    + " : " + ans);
        }

}
