package Conditionals;

import java.util.Scanner;

//public class Conditionals.Practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =9;
//        int i,j;
//        for (i=0;i<n;i++){
//            for (j=0;j<n;j++){
//                if ( j==0 && i!=0 && i!=n || i==0 && j!=(n-1) && j!=0 || j==(n-1) && i!=0 && i<=n/2  || i==n/2 && j!=n-2 && j!=1  ) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }
//
//    }
//}

//Code For  A
//public class Conditionals.Practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n =9;
//        int i,j;
//        for (i=0;i<n;i++){
//            for (j=0;j<n;j++){
//                if (  i+j==(n-5) && i!=0||j-i==(n-5) ||i==2&&j<=n-3&&j>=3) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//            for (j=0;j<n;j++){
//                if (  i+j==(n-5) && i!=0||j-i==(n-5) ||i==2&&j<=n-3&&j>=3) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//
//        }
//
//    }
//}


public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =9;
        int i,j;
        for (i=0;i<n;i++){
            for (j=0;j<n;j++){
                if (i!=0&&j==0 ||i==0&&j>=1&&j<=n-2 || j==(n-1)&&i!=0 ||i == n/2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (j=0;j<n;j++){
                if (j==0 ||i==0&&j!=n-1 || j==n-1&& i!=0&&i!=n/2&&i!=n-1 ||i==n-1&&j!=n-1 ||i==n/2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for (j=0;j<n;j++){
                if (i!=0&&j==0&&i!=n-1 ||i==0&&j>=1&&j<=n-2 || i==n-1&&j>=1&&j<=n-2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for (j=0;j<n;j++){
                if (j==0 ||i==0&&j!=n-1 || j==n-1&& i!=0&&i!=n-1 ||i==n-1&&j!=n-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (j=0;j<n;j++){
                if (i!=0&&j==0&&i!=n/2 ||i==0&&j>=1&&j<=n-2 || i==n-1&&j>=1&&j<=n-2||i==n/2&&j!=n-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for (j=0;j<n;j++){
                if (j==0&&i!=n/2 ||i==0&&j!=n-1 ||i==n/2&&j!=n-1 ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (j=0;j<n;j++){
                if (i!=0&&j==0 ||i==0&&j>=1&&j<=n-2 || i==n-1&&j>=1&&j<=n-2 ||i>=n/2&&j==n-1||i==n/2&&j>=3) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for (j=0;j<n;j++){
                if (j==0&&i!=n/2 ||i==n/2&&j!=n-1||j==n-1 ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for (j=0;j<n;j++){
                if (i!=0&&j==n-5 ||i==0&&j>=1&&j<=n-2 || i==n-1&&j>=1&&j<=n-2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");
            for (j=0;j<n;j++){
                if (j==n-1 ||i==0&&j!=n-1 ||i-j==6 || i==n-1 &&j>=3 ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("    ");
            for (j=0;j<n;j++){
                if (j==0&&i!=n/2 ||i+j==(n/2)+1|| i-j==(n/2)-1  ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("  ");

        }
    }
}
