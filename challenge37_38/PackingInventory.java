package challenge37_38;

import java.util.Scanner;

public class PackingInventory {

    // text colours
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Pack pack = new Pack();
        pack.printInventory();

        while(true) {

            int action = getAction();

            switch (action) {
                case 1:
                    InventoryItem newItem = createItem();
                    addItem(newItem, pack);
                    pack.printInventory();
                    break;
                case 2:
                    removeItem(pack);
                    pack.printInventory();
                    break;
                case 3:
                    emtyPack(pack);
                    pack.printInventory();
                    break;
                default :
                    System.out.println(ANSI_RED + "Input invalid, please try something else." + ANSI_RESET);
                    break;

            }

        }

    }

    public static int getAction() {

        System.out.println("""
                What would you like to do?:
                1. Add item
                2. Remove item
                3. Empty inventory""");
        String stringInput = scanner.next();

        while (!stringInput.equals("1") && !stringInput.equals("2") && !stringInput.equals("3")) {
            System.out.println(ANSI_RED + "Input invalid, please try something else." + ANSI_RESET);
            stringInput = scanner.next();
        }

        return Integer.parseInt(stringInput);

    }
    public static InventoryItem createItem() {

        boolean repeat;
        InventoryItem newItem = null;

        do {

            System.out.println("Which item would you like to add?");
            String userInput = scanner.next();

            switch (userInput.toLowerCase()) {
                case "bow":
                    newItem = new Bow();
                    repeat = false;
                    break;
                case "arrow":
                    newItem = new Arrow();
                    repeat = false;
                    break;
                case "food":
                    newItem = new Food();
                    repeat = false;
                    break;
                case "water":
                    newItem = new Water();
                    repeat = false;
                    break;
                case "rope":
                    newItem = new Rope();
                    repeat = false;
                    break;
                case "sword":
                    newItem = new Sword();
                    repeat = false;
                    break;
                default:
                    System.out.println(ANSI_RED + "Invalid item, please try something else." + ANSI_RESET);
                    repeat = true;
            }


        } while (repeat);

        return newItem;

    }
    public static void addItem(InventoryItem newItem, Pack pack) {

        boolean enoughRoom = pack.add(newItem);

        if (!enoughRoom) {
            System.out.println(ANSI_RED + "Inventory is full, please remove an item before you can add more." + ANSI_RESET);
        }

    }
    public static void removeItem(Pack pack) {

        System.out.println("Enter the position of the item you would like to remove.");
        String stringIndex = scanner.next();
        boolean repeat = true;

        while (repeat) {
            try {
                int index = Integer.parseInt(stringIndex);
                repeat = false;
            } catch (NumberFormatException nfe) {
                System.out.println(ANSI_RED + "Input invalid, please try something else." + ANSI_RESET);
                stringIndex = scanner.next();
            }
        }

        int index = Integer.parseInt(stringIndex) - 1;

        boolean slotIsEmpty = pack.remove(index);

        if (slotIsEmpty) {
            System.out.println(ANSI_RED + "No item to remove." + ANSI_RESET);
        }

    }
    public static void emtyPack(Pack pack) {

        System.out.println(ANSI_RED + "Are you sure you want to empty your inventory?" + ANSI_RESET);
        String yesNo = scanner.next();

        if (yesNo.equalsIgnoreCase("yes")) {
            boolean alreadyEmpty = pack.empty();

            if (alreadyEmpty) {
                System.out.println(ANSI_RED + "Inventory is already empty." + ANSI_RESET);
            }

        }

    }

}


