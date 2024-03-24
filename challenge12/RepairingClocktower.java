package challenge12;

import java.util.Scanner;

public class RepairingClocktower {

    public static void main (String args[]) {

        String message;

        Scanner scanner = new Scanner(System.in);

        //Input
        System.out.println("Input a number from 1 to 60");
        int number = scanner.nextInt();

        scanner.close();

        // Decide what to do
        if(number % 2 == 0) {
            message = "Tick";
        } else {
            message = "Tock";
        }

        System.out.println(message);

    }


}
