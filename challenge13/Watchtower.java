package challenge13;

import java.util.Scanner;

public class Watchtower {

    public static void main (String args[]) {

        //Variables
        String message;

        Scanner scanner = new Scanner(System.in);

        //Ask Input
        System.out.println("What is the value of x");
        int x = scanner.nextInt();

        System.out.println("What is the value of y");
        int y = scanner.nextInt();

        scanner.close();

        //Set messages
        if ( x > 0 && y < 0 ) {
            message = "The enemy is to the east!";
        } else if ( x < 0 && y > 0) {
            message = "The enemy is to the north!";
        } else if ( x > 0 && y > 0 ) {
            message = "The enemy is to the northeast!";
        } else {
            message = "The enemy is here!";
        }

        //Output
        System.out.println(message);

    }

}
