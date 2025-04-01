import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        
        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10; // Set a limit on attempts
            boolean hasGuessedCorrectly = false;
            
            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have chosen a number between 1 and 100. Can you guess it?");
            
            while (!hasGuessedCorrectly && attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("You've run out of attempts! The number was: " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }
        
        System.out.println("Thank you for playing! Goodbye.");
        scanner.close();
    }
}