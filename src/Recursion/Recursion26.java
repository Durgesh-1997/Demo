package Recursion;

public class Recursion26 {
//    static void subsetSum(int[] a, int n, int idx, int sum){
//        if(idx >= n){
//            System.out.println(sum);
//            return;
//        }
//        subsetSum(a, n, idx+1, sum ); // include
//        subsetSum(a, n, idx+1, sum); //exclude
//    }
//
//
//    public static void main(String[] args) {
//        int[] a = {2, 4, 5};
//        subsetSum(a, a.length, 0, 0);
//    }



    // Recursive function
    static void fun(int n)
    {
        if (n > 0) {
            System.out.print(" "+ n);

            // Calling once
            fun(n - 1);


            // Calling twice
            fun(n - 1);
        }
    }

    // Driver code
    public static void main(String[] args)
    {

        fun(3);
    }
}
