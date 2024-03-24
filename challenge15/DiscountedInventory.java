package challenge15;

import java.util.Scanner;

public class DiscountedInventory {

    static Scanner scanner = new Scanner(System.in);
    // Set prices
    static int rope = 10;
    static int torches = 15;
    static int climbingEquipment = 25;
    static int cleanWater = 1;
    static int machete = 20;
    static int canoe = 200;
    static int foodSupplies = 1;

    public static void main (String args[]) {

        printMenu();

        // Get info
        String name = getName();

        int chosenItem = getNumber();

        // Calculate price
        int fullPrice = getFullPrice(chosenItem);

        int price = getPrice(name, fullPrice);


        //Output
        System.out.println("This item is " + price + " gold.");

    }


    public static void printMenu() {
        System.out.println("The following items are available:");
        System.out.println("1. Rope");
        System.out.println("2. Torches");
        System.out.println("3. Climbing Equipment");
        System.out.println("4. Clean Water");
        System.out.println("5. Machete");
        System.out.println("6. Canoe");
        System.out.println("7. Food Supplies");
    }

    public static int getNumber() {
        System.out.println("Which menu item would you like to know the price of?");
        int chosenItem = scanner.nextInt();
        return chosenItem;
    }

    public static int getFullPrice(int chosenItem) {

        int price;

        switch (chosenItem) {

            case 1:
                price = rope;
                break;
            case 2 :
                price = torches;
                break;
            case 3 :
                price = climbingEquipment;
                break;
            case 4 :
                price = cleanWater;
                break;
            case 5 :
                price = machete;
                break;
            case 6 :
                price = canoe;
                break;
            case 7 :
                price = foodSupplies;
                break;
            default:
                price = 0;
                break;
        }

        return price;
    }

    public static String getName() {

        System.out.println("What is your name?");
        String name = scanner.next();

        System.out.println("Hello, " + name);
        return name;
    }

    public static int getPrice(String name, int fullPrice) {

        if(name.equalsIgnoreCase("Else")) {
            int newPrice = fullPrice / 2;
            return newPrice;
        } else {
            return fullPrice;
        }
    }
}

