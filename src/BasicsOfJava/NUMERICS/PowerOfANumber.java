package BasicsOfJava.NUMERICS;

public class PowerOfANumber {

    public static void main(String[] args) {

        int basenumber = 2, exponent = 3;
        long temp = 1;

        for (;exponent != 0; --exponent) {
            temp *= basenumber;
        }

        System.out.println("Result: " + temp);
    }
}
