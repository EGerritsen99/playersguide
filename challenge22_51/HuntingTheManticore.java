package challenge22_51;

import java.util.Random;
import java.util.Scanner;

public class HuntingTheManticore {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Input option 1 or 2: \n1. Multiplayer \n2. Singleplayer");
        int choice = scanner.nextInt();

        int manticoreRange;

        if (choice == 1) {
            manticoreRange = getRangeMultiplayer();

        } else {
            Random random = new Random();
            manticoreRange = random.nextInt(0, 101);
        }

        playGame(manticoreRange);

    }

    public static void playGame(int manticoreRange) {

        int manticoreHealth = 10;
        int cityHealth = 15;
        int roundNumber = 1;

        while (manticoreHealth > 0 && cityHealth > 0) {
            int amountOfDamage = getDamage(roundNumber);

            displayStats(roundNumber, cityHealth, manticoreHealth, amountOfDamage);

            manticoreHealth = shootCannon(manticoreRange, manticoreHealth, amountOfDamage);

            cityHealth = cityHealth(manticoreHealth, cityHealth);

            roundNumber++;

        }

        System.out.println("The Manticore has been destroyed! The city of Consolas has been saved!");

    }

    public static int getRangeMultiplayer() {
        int maxRange = 100;
        int minRange = 0;

        System.out.println("Player 1, how far away from the city do you want to station the Manticore?");
        int manticoreRange = scanner.nextInt();

        while (manticoreRange > maxRange || manticoreRange < minRange) {
            System.out.println("The range must be between 0 and 100, please try again.");
            manticoreRange = scanner.nextInt();
        }

        getBlankPage();

        return manticoreRange;

    }

    public static void getBlankPage() {

        int numberOfBlankLines = 30;

        for (int i = 0; i < numberOfBlankLines; i++) {
            System.out.println();

        }

        System.out.println("Player 2, it is your turn.");

    }

    public static int getDamage(int i) {

        int amountOfDamage;

        if ( (i) % 5 == 0 && (i) % 3 == 0 ) {
            amountOfDamage = 10;
        } else if ( (i) % 3 == 0 ) {
            amountOfDamage = 3;
        } else if ( (i) % 5 == 0 ) {
            amountOfDamage = 5;
        } else {
            amountOfDamage = 1;
        }

        return amountOfDamage;

    }

    public static void displayStats(int roundNumber, int cityHealth, int manticoreHealth, int amountOFDamage) {

        System.out.println("STATUS: Round: " + roundNumber + " City: " + cityHealth + " Manticore: " + manticoreHealth);
        System.out.println("The cannon is expected to deal " + amountOFDamage + " damage this round.");

    }

    public static int shootCannon(int manticoreRange, int manticoreHealth, int amountOfDamage) {
        System.out.println("Enter desired cannon range:");
        int cannonRange = scanner.nextInt();

        if (cannonRange == manticoreRange) {
            System.out.println("That round was a DIRECT HIT!");
            manticoreHealth -= amountOfDamage;

        } else if (cannonRange > manticoreRange) {
            System.out.println("That round OVERSHOT the target.");

        } else if (cannonRange < manticoreRange) {
            System.out.println("That round FELL SHORT of the target.");

        } else {
            System.out.println("The range must be between 0 and 100, please try again");
        }

        return manticoreHealth;

    }

    public static int cityHealth(int manticoreHealth, int cityHealth) {

        if (manticoreHealth != 0) {
            cityHealth -= 1;
        }

        return cityHealth;

    }

}
