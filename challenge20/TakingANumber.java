package challenge20;

import java.util.Scanner;

public class TakingANumber {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String text1 = "Enter a number";
        String text2 = "Enter a number between 0 and 100.";
        int maxNumber = 100;
        int minNumber = 0;

        int number = askForNumber(text1);
        int numberInRange = askForNumberInRange(text2, maxNumber, minNumber);

    }

    public static int askForNumber(String text) {

        System.out.println(text);
        double doubleNumber = scanner.nextDouble();
        int number = (int)doubleNumber;

        return number;

    }

    public static int askForNumberInRange(String text, int maxNumber, int minNumber) {

        System.out.println(text);
        int number = scanner.nextInt();

         do {
            System.out.println("Number is out of range, enter a number between 0 and 100.");
            number = scanner.nextInt();
        } while (number > maxNumber || number < minNumber);

        return number;

    }

}
