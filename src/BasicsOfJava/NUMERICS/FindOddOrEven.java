package BasicsOfJava.NUMERICS;

import java.util.Scanner;

public class FindOddOrEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of size");
        int a = sc.nextInt();

        int arr[] = new int[a];

        for (int i = 0; i<a; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i<a; i++) {
            if (arr[i] % 2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
        }
    }
}
