package Recursion;

//public class fibo {
//    public static void main(String[] args) {
//        print(1);
//    }
//    static void print(int n){
//        // base condition
//        if (n == 5){
//            System.out.println(5);
//            return;
//        }
//        System.out.println(n);
//
//        // recursive call
//        //if you are calling a function again
//        print(n + 1);
//    }
//}


public class fibo {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    static int fibo(int n){
        // base condition
        if (n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}