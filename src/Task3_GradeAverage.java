import java.util.Scanner;

public class Task3_GradeAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int grade;
        double total  = 0;
        int count     = 0;
        double average;

        final int SENTINEL = -1;

        System.out.print("Enter a grade (0-100), or -1 to stop: ");
        grade = scanner.nextInt();

        while (grade != SENTINEL) {
            total += grade;
            count++;
            System.out.print("Enter next grade (0-100), or -1 to stop: ");
            grade = scanner.nextInt();
        }

        if (count > 0) {
            average = total / count;
            System.out.printf("%nGrades entered: %d%n", count);
            System.out.printf("Average grade:  %.2f%n", average);
        } else {
            System.out.println("\nNo grades were entered.");
        }

        scanner.close();
    }
}