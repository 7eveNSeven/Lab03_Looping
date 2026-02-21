import java.util.Scanner;

public class Task1_ShoppingCart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0;
        double itemPrice;
        double shipping;
        double totalCost;
        String continueAnswer;


        final double FREE_SHIPPING_MIN = 100.00;
        final double SHIPPING_RATE = 0.02;

        do {
            System.out.print("Enter item price: $");
            itemPrice = scanner.nextDouble();
            scanner.nextLine();
            totalPrice += itemPrice;

            System.out.print("Add another item? (Y/N): ");
            continueAnswer = scanner.nextLine().trim().toUpperCase();

        } while (continueAnswer.equals("Y"));

        if (totalPrice >= FREE_SHIPPING_MIN) {
            shipping = 0;
        } else {
            shipping = totalPrice * SHIPPING_RATE;
        }

        totalCost = totalPrice + shipping;

        System.out.printf("%nTotal price of items: $%.2f%n", totalPrice);
        System.out.printf("Shipping cost:        $%.2f%n", shipping);
        System.out.printf("Total cost:           $%.2f%n", totalCost);

        scanner.close();
    }

}

