package challenge18;

import java.util.Scanner;

public class Replicator {

    public static void main(String args[]) {

        int lengthOfArray = 5;
        Scanner scanner = new Scanner(System.in);

        // Create Array
        int[] arrayOfNumbers = new int[lengthOfArray];

        // Ask user for 5 numbers and put in array
        for ( int i = 0; i < lengthOfArray; i++) {
            System.out.println("Enter a number.");
            arrayOfNumbers[i] = scanner.nextInt();
        }

        // Create new array
        int[] copyOfArrayOfNumbers = new int[lengthOfArray];

        // Copy old to new array
        for ( int i = 0; i < lengthOfArray; i++) {
            copyOfArrayOfNumbers[i] = arrayOfNumbers[i];
        }


        // Output both arrays
        System.out.println("This is array 1:");
        System.out.println(arrayOfNumbers[0]);
        System.out.println(arrayOfNumbers[1]);
        System.out.println(arrayOfNumbers[2]);
        System.out.println(arrayOfNumbers[3]);
        System.out.println(arrayOfNumbers[4]);

        System.out.println("This is array 2:");
        System.out.println(copyOfArrayOfNumbers[0]);
        System.out.println(copyOfArrayOfNumbers[1]);
        System.out.println(copyOfArrayOfNumbers[2]);
        System.out.println(copyOfArrayOfNumbers[3]);
        System.out.println(copyOfArrayOfNumbers[4]);
    }

}
