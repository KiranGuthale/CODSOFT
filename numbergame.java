import java.util.Random;
import java.util.Scanner;
public class numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;
        int round = 0;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between " + minRange + " and " + maxRange);

        while (true) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;

            System.out.println("Round " + ++round);

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (attempt " + (attempts + 1) + "/" + maxAttempts + "): ");
                int userGuess = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (userGuess < minRange || userGuess > maxRange) {
                    System.out.println("Your guess is out of range. Please guess between " + minRange + " and " + maxRange);
                    continue;
                }

                if (userGuess < targetNumber) {
                    System.out.println("Your guess is  low.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Your guess is  high.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                    score += (maxAttempts - attempts);
                    break;
                }

                attempts++;
            }

            if (attempts >= maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.nextLine().trim().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Game Over! Your total score is: " + score);
        scanner.close();
    }
}
