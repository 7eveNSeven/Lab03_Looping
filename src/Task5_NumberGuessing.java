import java.util.Scanner;


public class Task5_NumberGuessing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int low      = 1;
        int high     = 10;
        int guess;
        String feedback;
        boolean found = false;
        int guessCount = 0;

        System.out.println("Think of a number between 1 and 10. I will guess it!");
        System.out.println("  Enter  +  if my guess is too HIGH");
        System.out.println("  Enter  -  if my guess is too LOW");
        System.out.println("  Enter  !  if I guessed correctly");
        System.out.println();

        while (!found) {
            guess = (low + high) / 2;
            guessCount++;

            System.out.print("My guess is: " + guess + "  -->  Enter +, -, or !: ");
            feedback = scanner.nextLine().trim();

            if (!feedback.equals("!")) { // this a case
                if (feedback.equals("+")) {
                    high = guess - 1;

                } else if (feedback.equals("-")) {
                    low = guess + 1;
                } else {
                    System.out.println("  (Please enter only +, -, or !)");
                    guessCount--;
                }
            } else {
                found = true;
                System.out.println("\nGot it! The number was " + guess + "!");
                System.out.println("It took me " + guessCount + " guess(es).");

            }
        }

        scanner.close();
    }
}