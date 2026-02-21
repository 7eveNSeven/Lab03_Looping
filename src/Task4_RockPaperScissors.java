import java.util.Scanner;

public class Task4_RockPaperScissors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String moveA;
        String moveB;
        String playAgain;

        do {
            System.out.print("Player A, enter your move (R, P, or S): ");
            moveA = scanner.nextLine().trim().toUpperCase();

            System.out.print("Player B, enter your move (R, P, or S): ");
            moveB = scanner.nextLine().trim().toUpperCase();


            if (moveA.equals(moveB)) {
                System.out.println("It's a tie!");


            } else if (moveA.equals("R") && moveB.equals("S")) {
                System.out.println("Rock crushes Scissors! Player A wins!");
            } else if (moveA.equals("P") && moveB.equals("R")) {
                System.out.println("???");

            } else if (moveA.equals("???") && moveB.equals("???")) {
                System.out.println("???");


            } else if (moveA.equals("S") && moveB.equals("R")) {
                System.out.println("Rock crushes Scissors! Player B wins!");

            } else if (moveA.equals("???") && moveB.equals("???")) {
                System.out.println("???");
                System.out.println("???");

            } else if (moveA.equals("???") && moveB.equals("???")) {
                System.out.println("???");
                System.out.println("???");

            }

            System.out.print("\nPlay again? (Y/N): ");
            playAgain = scanner.nextLine().trim().toUpperCase();

        } while (playAgain.equals("???"));  

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}