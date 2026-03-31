import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean playAgain;

        do {
            int numberToGuess = rand.nextInt(100) + 1; // 1–100
            int guess = 0;
            int attempts = 0;

            System.out.println("🎯 Guess the number between 1 and 100!");

            while (guess != numberToGuess) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess > numberToGuess) {
                    System.out.println("📉 Too high!");
                } else if (guess < numberToGuess) {
                    System.out.println("📈 Too low!");
                } else {
                    System.out.println("🎉 Correct! You guessed in " + attempts + " attempts.");
                }
            }

            System.out.print("Do you want to play again? (true/false): ");
            playAgain = sc.nextBoolean();

        } while (playAgain);

        System.out.println("👋 Thanks for playing!");
        sc.close();
    }
}