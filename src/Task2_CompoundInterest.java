import java.util.Scanner;

public class Task2_CompoundInterest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double balance;
        double monthlyRate;


        final int MONTHS = 12;

        System.out.print("Enter initial balance: $");
        balance = scanner.nextDouble();

        System.out.print("Enter monthly interest rate (e.g. 0.05 for 5%): ");
        monthlyRate = scanner.nextDouble();

        System.out.println("\n--- Monthly Balance Report ---");

        for (int month = 1; month <= MONTHS; month++) {
            balance = balance + (balance * monthlyRate);
            System.out.printf("Month %2d balance: $%.2f%n", month, balance);
        }

        scanner.close();
    }
}
