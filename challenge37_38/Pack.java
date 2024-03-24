package challenge37_38;

import java.util.ArrayList;

public class Pack {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";

    // Fields
    static ArrayList<InventoryItem> inventory = new ArrayList<>();

    static final double MAX_WEIGHT = 15;
    static final double MAX_VOLUME = 25;
    static final int MAX_NUMBER_OF_ITEMS = 10;

    private double totalWeight;
    private double totalVolume;
    private int itemCount;

    // Methods
    public void printInventory() {

        System.out.println();
        System.out.println(ANSI_CYAN + "Inventory content:"
                + "\n***************");

        for (int i = 0; i < inventory.size(); i++) {
            System.out.println((i + 1) + ". " + inventory.get(i).getStringValue());
        }

        System.out.println("***************\n");

        System.out.println("Weight: " + String.format("%.2f", totalWeight) + "/" + MAX_WEIGHT);
        System.out.println("Volume: " + String.format("%.2f", totalVolume) + "/" + MAX_VOLUME);
        System.out.println("Amount of items: " + itemCount + "/" + MAX_NUMBER_OF_ITEMS + ANSI_RESET);

    }

    public boolean add(InventoryItem item) {

        if (totalVolume + item.getVolume() <= MAX_VOLUME
                && totalWeight + item.getWeight() <= MAX_WEIGHT
                && itemCount < MAX_NUMBER_OF_ITEMS) {

            inventory.add(item);
            totalWeight += item.getWeight();
            totalVolume += item.getVolume();
            itemCount = inventory.size();

            return true;

        } else {
            return false;
        }

    }

    public boolean remove(int index) {

        if (inventory.size() < index){
            return true;
        } else {

            InventoryItem removedItem = inventory.get(index);
            inventory.remove(index);

            totalWeight -= removedItem.getWeight();
            totalVolume -= removedItem.getVolume();
            itemCount = inventory.size();

            return false;
        }
    }

    public boolean empty() {

        if (inventory.isEmpty()) {
            return true;
        } else {

            inventory.clear();
            totalWeight = 0;
            totalVolume = 0;
            itemCount = 0;

            return false;
        }

    }

}
