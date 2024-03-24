package challenge14;

import java.util.Scanner;

public class BuyingInventory {

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

        int chosenItem = getNumber();

        int price = getPrice(chosenItem);


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

    public static int getPrice(int chosenItem) {

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

}


