import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1; // Lower bound of the number range
        int upperBound = 100; // Upper bound of the number range
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int maxAttempts = 5; // Maximum number of attempts

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            System.out.print("Attempt " + attempts + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low! Try a higher number.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try a lower number.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                return;
            }
        }

        System.out.println("Sorry, you've run out of attempts!");
        System.out.println("The correct number was: " + randomNumber);
    }
}

