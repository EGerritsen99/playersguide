package challenge5;

import java.util.Scanner;

public class TheThingNamer3000 {

    public static void main (String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("What kind of thing are we talking about?");
        String theThing = input.next(); // Names the thing that has to be named
        System.out.println("How would you describe it? Big? Azure? Tattered?");
        String featureOfTheThing = input.next(); // Describes the thing that has to be named
        /* c and d add Doom 3000 to the end of
        every name.
         */
        String c = "Doom";
        String d = "3000";

        //changed this to make the code more understandable
        System.out.println("The " + featureOfTheThing + " " + theThing + " of Doom 3000!");

    }

}
