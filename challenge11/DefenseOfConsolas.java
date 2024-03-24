package challenge11;

import java.awt.*;
import java.util.Scanner;

public class DefenseOfConsolas {

    public static void main (String args[]) {

        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_RESET = "\u001B[0m";

        Scanner scanner = new Scanner(System.in);

        // Get row and column
        System.out.println("Which row is the target on?");
        int targetRow = scanner.nextInt();

        System.out.println("Which collumn is the target on?");
        int targetColumn = scanner.nextInt();

        scanner.close();

        // Calculate
        int deployRow1 = targetRow - 1;
        int deployRow2 = targetRow + 1;
        int deployColumn1 = targetColumn - 1;
        int deployColumn2 = targetColumn + 1;

        // Deploy to message with sound and colour
        System.out.println(ANSI_BLUE + "Deploy to:");
        System.out.println("(" + targetRow + ", " + deployColumn1 + ")");
        System.out.println("(" + deployRow1 + ", " + targetColumn + ")");
        System.out.println("(" + targetRow + ", " + deployColumn2 + ")");
        System.out.println("(" + deployRow2 + ", " + targetColumn + ")" + ANSI_RESET);

        Toolkit.getDefaultToolkit().beep();

    }

}
