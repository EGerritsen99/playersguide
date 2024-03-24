package challenge9;

import java.util.Scanner;

public class TheFourSisters {

    public static void main (String args[]) {

        //Get number of eggs
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many eggs did you gather today?");
        int eggsGathered = scanner.nextInt();

        scanner.close();

        //Calculate eggs per sister
        int eggsPerSister = eggsGathered / 4;

        int eggsForDuckbear = eggsGathered % 4;

        //Output results

        System.out.println("Each sister gets " + eggsPerSister + " eggs.");
        System.out.println("The Duckbear gets " + eggsForDuckbear + " eggs.");

    }

}
