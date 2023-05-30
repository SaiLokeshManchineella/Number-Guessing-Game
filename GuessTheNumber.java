import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int range = 100; // the range of the random number
        int secretNumber = random.nextInt(range) + 1; // generate a random number from 1 to 100
        int maxAttempts = 5; // the maximum number of attempts
        int attempts = 0; // the current number of attempts
        int score = 0; // the player's score

        System.out.println("Guess the secret number between 1 and " + range + ".");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess (attempt " + (attempts + 1) + "/" + maxAttempts + "): ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations, you guessed the secret number!");
                score = maxAttempts - attempts;
                break;
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }

            attempts++;
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry, you didn't guess the secret number in " + maxAttempts + " attempts.");
        }

        System.out.println("Your score is " + score + ".");
    }
}
