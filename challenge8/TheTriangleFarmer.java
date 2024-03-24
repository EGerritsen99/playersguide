package challenge8;

import java.util.Scanner;

public class TheTriangleFarmer {

    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the base of the triangle?");
        double base = scanner.nextDouble();

        System.out.println("What is the height of the triangle?");
        double height = scanner.nextDouble();

        scanner.close();

        double area = base * height / 2;

        System.out.println("The area of the triangle is: " + area);

    }

}
