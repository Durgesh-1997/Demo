package BasicsOfJava.NUMERICS;

import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        int number, originalNumber, lastDigit, sum = 0, digits = 0, temp;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        number = scanner.nextInt();
        originalNumber = number;

        // Calculate the number of digits
        temp = number;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        while (originalNumber != 0) {
            // lastDigit contains the last digit of the number
            lastDigit = originalNumber % 10;

            // raise the last digit to the power of digits and add it to the sum
            sum += Math.pow(lastDigit, digits);

            // remove last digit from the original number
            originalNumber /= 10;
        }

        // Check if the sum equals the original number
        if (sum == number)
            System.out.printf("%d is an Armstrong number.\n", number);
        else
            System.out.printf("%d is not an Armstrong number.\n", number);
    }
}
