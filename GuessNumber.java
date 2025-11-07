import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(10) + 1; // Random number 1-10
        int guess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I picked a number between 1 and 10. Try to guess it:");

        while (guess != number) {
            System.out.print("Your guess: ");
            if(scanner.hasNextInt()) {
                guess = scanner.nextInt();
                if (guess < number) {
                    System.out.println("Too low!");
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed it!");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }
        scanner.close();
    }
}
