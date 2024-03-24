package challenge24;

import java.util.Scanner;

public class SimulasSoup extends Recipe{

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        displayMenu();

        Soup soup = new Soup();

        soup.setType(getDish());
        soup.setIngredient(getMainIngredient());
        soup.setSeasoning(getFlavour());

        System.out.println("Here is your " + soup.getSeasoning().stringValue + " " + soup.getIngredient().stringValue + " " + soup.getType().stringValue);

    }

    public static void displayMenu() {

        System.out.println("Dishes:");
        for (Type dish : Type.values()) {
            System.out.println(dish.toString().toLowerCase());
        }

        System.out.println(" "); // Blank Line

        System.out.println("Seasonings:");
        for (Seasoning flavour : Seasoning.values()) {
            System.out.println(flavour.toString().toLowerCase());
        }

        System.out.println(" "); // Blank Line

        System.out.println("Ingredients:");
        for (Ingredient ingredient : Ingredient.values()) {
            System.out.println(ingredient.toString().toLowerCase());
        }

    }

    public static Type getDish() {
        System.out.println("What type of soup would you like?");

        String type = scanner.next();
        Type dish;

        while (true) {
            if (type.equalsIgnoreCase(Type.STEW.stringValue)) {
                dish = Type.STEW;
                return dish;
            } else if (type.equalsIgnoreCase(Type.GUMBO.stringValue)) {
                dish = Type.GUMBO;
                return dish;
            } else if (type.equalsIgnoreCase(Type.SOUP.stringValue)) {
                dish = Type.SOUP;
                return dish;
            } else {
                System.out.println("We don't serve that dish, please choose a dish off the menu.");
                type = scanner.next();
            }
        }
    }

    public static Ingredient getMainIngredient() {

        System.out.println("What would you like to be the main ingredient?");

        String ingredient = scanner.next();
        Ingredient mainIngredient;

        while (true) {
            if (ingredient.equalsIgnoreCase(Ingredient.MUSHROOM.stringValue)) {
                mainIngredient = Ingredient.MUSHROOM;
                return mainIngredient;
            } else if (ingredient.equalsIgnoreCase(Ingredient.CARROTS.stringValue)) {
                mainIngredient = Ingredient.CARROTS;
                return mainIngredient;
            } else if (ingredient.equalsIgnoreCase(Ingredient.CHICKEN.stringValue)) {
                mainIngredient = Ingredient.CHICKEN;
                return mainIngredient;
            } else if (ingredient.equalsIgnoreCase(Ingredient.POTATOES.stringValue)) {
                mainIngredient = Ingredient.POTATOES;
                return mainIngredient;
            } else {
                System.out.println("We don't have that ingredient, please choose an ingredient off the menu.");
                ingredient = scanner.next();
            }
        }

    }

    public static Seasoning getFlavour() {

        System.out.println("What flavour would you like?");

        String seasoning = scanner.next();
        Seasoning flavour;

        while (true) {
            if (seasoning.equalsIgnoreCase(Seasoning.SWEET.stringValue)) {
                flavour = Seasoning.SWEET;
                return flavour;
            } else if (seasoning.equalsIgnoreCase(Seasoning.SPICY.stringValue)) {
                flavour = Seasoning.SPICY;
                return flavour;
            } else if (seasoning.equalsIgnoreCase(Seasoning.SALTY.stringValue)) {
                flavour = Seasoning.SALTY;
                return flavour;
            } else {
                System.out.println("We don't have that seasoning, please choose a flavour off the menu.");
                seasoning = scanner.next();
            }
        }

    }
}
