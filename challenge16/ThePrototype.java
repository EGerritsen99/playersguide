package challenge16;

import java.util.Scanner;

public class ThePrototype {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String args[]) {

        // Get number
        int number = getNumber();

        // Guess
        playGuessingGame(number);

    }

    public static int getNumber() {

        System.out.println("User 1, enter a number between 0 and 100");
        int number = scanner.nextInt();

        while ( number > 100 || number < 0 ) {
            System.out.println("Invalid number. The number must be between 0 and 100. Please try again.");
            number = scanner.nextInt();
        }

        // Blank Screen
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        return number;
    }

    public static void playGuessingGame(int number) {

        System.out.println("User 2, guess the number.");
        int guess = scanner.nextInt();

        while (guess != number) {
            if (guess > number) {
                System.out.println( guess + " is too high");
            } else if (guess < number) {
                System.out.println(guess + " is too low.");
            }

            System.out.println("What is your next guess?");
            guess = scanner.nextInt();
        }

        System.out.println("You guessed the number!");

    }

}
