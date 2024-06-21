package Recursion;
//sum of digit with recursion method
public class Recursion15 {
    static int sod(int n){
        if(n >= 0 && n <= 9) return n;
        return sod(n/10) + n%10;
    }

    public static void main(String[] args) {
        System.out.println(sod(12345));
    }
}
