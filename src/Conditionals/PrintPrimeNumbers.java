package Conditionals;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

//public class PrintPrimeNumbers {
//    public static void main(String[] args) {
//        System.out.println("Prime numbers from 1 to 100:");
//        for (int i = 1; i <= 100; i++) {
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
//    }
//
//    public static boolean isPrime(int number) {
//        if (number <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//}


//public class PrintPrimeNumbers {
//    public static void main(String[] args) {
//        System.out.println("Prime numbers from 1 to 100:");
//
//        for (int number = 2; number <= 100; number++) {
//            boolean isPrime = true;
//
//            for (int i = 2; i < number; i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//
//            if (isPrime) {
//                System.out.print(number + " ");
//            }
//        }
//    }
//}

