package loops;
import java.util.*;

public class Complex {         // pw skills print in star pattern logic//
    public static void main(String[] args){
        int n=9;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j==0 && i!=0 && i!=n || i==0 && j!=(n-1) && j!=0 || j==(n-1) && i!=0 && i<=n/2  || i==n/2 && j!=n-1 && j!=0 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.print("     ");
            for(int j=0; j<n; j++)
        {
            if(j==0 && i!=0 && i!=n || i>=n/2 &&j-i==0 ||j<=n/2&&j+i==n-1 ||  j==(n-1) && i!=0 && i!=n)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }

        }
            System.out.print("             ");
            for(int j=0; j<n; j++)
        {
            if( i==0 && j!=(n-1) && j!=0 ||j==0 && i!=0 && i<=n/2 || i==n/2 && j!=n-1 && j!=0 || i==n-1 && j!=n-1 && j!=0 || j==(n-1) && i!=0 && i>n/2  )
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }

        }
            System.out.print("     ");
            for(int j=0; j<n; j++)
        {
            if(j==0  ||  i-j==n/2 ||j+i== n/2  )
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }

        }
            System.out.print("   ");
            for(int j=0; j<n; j++)
        {
            if(j==n/2 && i!=0 && i!=n || i==0 && j!=(n-1) && j!=0  || i==n-1 && j!=n-1 && j!=0 )
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }

        }
            System.out.print("   ");
            for(int j=0; j<n; j++)
        {
            if(j==0 && i!=0 && i!=n || i==n-1 && j!=n-1 && j!=0 )
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }

        }
            System.out.print("  ");
            for(int j=0; j<n; j++)
        {
            if(j==0 && i!=0 && i!=n  || i==n-1 && j!=n-1 && j!=0 )
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }

        }
            System.out.print("  ");
            for(int j=0; j<n; j++)
        {
            if(i==0 && j!=(n-1) && j!=0 ||j==0 && i!=0 && i<=n/2 || i==n/2 && j!=n-1 && j!=0 || i==n-1 && j!=n-1 && j!=0 || j==(n-1) && i!=0 && i>n/2  )
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }

        }
            System.out.println( );


        }



    }


}









//
//public class Complex {      // Print Star Pattern Name DURGESH YADAV  //
//    public static void main(String[] args) {
//        int n = 9;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i==0 && j<(n-1)/2 || j==0 || i==n-1 && j<(n-1)/2 || j==(n+1)/2 && i>0 && i<n-1)
//                {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.print("   ");
//            for (int j = 0; j < n; j++) {
//                if ( j==0 || i==n-1 && j<(n-1)/2 || j==(n-1)/2 )
//                {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.print(" ");
//            for (int j = 0; j < n; j++) {
//                if (i==0 && j<=(n-1)/2 || j==0 || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 && i!=0 && i<=(n-1)/2 ||  i>=n/2 &&j-i==0)
//                {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.print("     ");
//            for (int j = 0; j < n; j++) {
//                if (i==0 && j<(n+1)/2 || j==0 || i==n-1 && j<(n-1)/2 || j==(n+1)/2 && i!=0 && i<=(n-5)/2  ||  i==(n+1)/2 && j<=(n-1)/2 || j==(n+1)/2 && i!=0 && i>=(n+1)/2 )
//                {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.print("  ");
//            for (int j = 0; j < n; j++) {
//                if (i==0 && j<(n-1)/2 || j==0 || i==n-1 && j<(n-1)/2 || i==(n-1)/2 && j<=(n-3)/2)
//                {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.print("");
//            for (int j = 0; j < n; j++) {
//                if (i==0 && j!=(n-1) && j!=0 ||j==0 && i!=0 && i<=n/2 || i==n/2 && j!=n-1 && j!=0 || i==n-1 && j!=n-1 && j!=0 || j==(n-1) && i!=0 && i>n/2 )
//                {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.print("    ");
//            for (int j = 0; j < n; j++) {
//                if (j==0 || i==(n-1)/2 && j<=(n-1)/2 || j==(n+1)/2)
//                {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.print("          ");
//            for (int j = 0; j < n; j++) {
//                if (i+j==n-1 || i<=n/2 &&j-i==0 )
//                {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.print("    ");
//            for (int j = 0; j < n; j++) {
//                if (i==0 && j<(n-1) || j==0 || i==(n-1)/2 && j<(n-1) || j==(n-1))
//                {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.print("    ");
//            for (int j = 0; j < n; j++) {
//                if (i==0 && j<(n-1)/2 || j==0 || i==n-1 && j<(n-1)/2 || j==(n+1)/2 && i>0 && i<n-1)
//                {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.print("");
//            for (int j = 0; j < n; j++) {
//                if (i==0 && j<(n-1) || j==0 || i==(n-1)/2 && j<(n-1) || j==(n-1))
//                {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.print("   ");
//            for (int j = 0; j < n; j++) {
//                if ( i-j==0)
//                {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.print("");
//            for (int j = 0; j < n; j++) {
//                if (i+j==n-1)
//                {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
//    }
//}



