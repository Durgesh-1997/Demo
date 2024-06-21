import java.util.Scanner;

public class CurrencyConverter {
    // Define exchange rates
    private static final double USD_TO_EUR = 0.83;
    private static final double USD_TO_GBP = 0.72;
    private static final double USD_TO_JPY = 109.80;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu
        System.out.println("Welcome to Currency Converter");
        System.out.println("1. Convert USD to EUR");
        System.out.println("2. Convert USD to GBP");
        System.out.println("3. Convert USD to JPY");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = scanner.nextInt();

        // Process user choice
        switch (choice) {
            case 1:
                convertUSDToEUR(scanner);
                break;
            case 2:
                convertUSDToGBP(scanner);
                break;
            case 3:
                convertUSDToJPY(scanner);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    // Method to convert USD to EUR
    private static void convertUSDToEUR(Scanner scanner) {
        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();
        double eurAmount = usdAmount * USD_TO_EUR;
        System.out.println("Equivalent amount in EUR: " + eurAmount);
    }

    // Method to convert USD to GBP
    private static void convertUSDToGBP(Scanner scanner) {
        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();
        double gbpAmount = usdAmount * USD_TO_GBP;
        System.out.println("Equivalent amount in GBP: " + gbpAmount);
    }

    // Method to convert USD to JPY
    private static void convertUSDToJPY(Scanner scanner) {
        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();
        double jpyAmount = usdAmount * USD_TO_JPY;
        System.out.println("Equivalent amount in JPY: " + jpyAmount);
    }
}
