package challenge10;

import java.util.Scanner;

public class TheDominionOfKings {

    public static void main (String args[]) {

        // Enter variables
        int pointsForEstate = 1;
        int pointsForDuchy = 3;
        int pointsForProvince = 6;

        // Get info
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many estates do you have?");
        int numberOfEstates = scanner.nextInt();

        System.out.println("How many duchies do you have?");
        int numberOfDuchies = scanner.nextInt();

        System.out.println("How many provinces do you have?");
        int numberOfProvinces = scanner.nextInt();

        scanner.close();

        // Add up
        int totalPoints = pointsForEstate * numberOfEstates + pointsForDuchy * numberOfDuchies + pointsForProvince * numberOfProvinces;

        // Output total
        System.out.println("Your total points are: " + totalPoints);
    }

}
