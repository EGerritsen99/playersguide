package challenge4;

import java.util.Scanner;

public class ConsolasAndTelim {

    public static void main (String args[]) {

        System.out.println("Bread is ready.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Who is the bread for?");
        String breadGetter = scanner.next();

        System.out.println("Noted: " + breadGetter + " got bread.");

    }
}
