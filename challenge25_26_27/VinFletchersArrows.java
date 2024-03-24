package challenge25_26_27;

import java.util.Scanner;

public class VinFletchersArrows extends Arrow {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        System.out.println("What type of arrows would you like?");
        System.out.println("The Elite Arrow");
        System.out.println("The Beginner Arrow");
        System.out.println("The Marksman Arrow");
        System.out.println("Custom Arrow");

        Arrow arrow = createArrow();

        ArrowheadType arrowMaterial = arrow.getArrowheadType();
        FletchingType fletchingMaterial = arrow.getFletchingType();
        int length = arrow.getLength();

        float cost = getCost(arrowMaterial, fletchingMaterial, length);

        System.out.println("That will be " + cost + " gold, please.");

    }

    public static ArrowheadType getArrowChoice(){

        System.out.println("What type of arrowhead would you like? Wood, steel or obsidian?");

        String material = scanner.next();
        ArrowheadType arrowMaterial;

        while (true) {
            if (material.equalsIgnoreCase(ArrowheadType.OBSIDIAN.stringValue)) {
                arrowMaterial = ArrowheadType.OBSIDIAN;
                return arrowMaterial;
            } else if (material.equalsIgnoreCase(ArrowheadType.STEEL.stringValue)) {
                arrowMaterial = ArrowheadType.STEEL;
                return arrowMaterial;
            } else if (material.equalsIgnoreCase(ArrowheadType.WOOD.stringValue)) {
                arrowMaterial = ArrowheadType.WOOD;
                return arrowMaterial;
            } else {
                System.out.println("We don't have that material. Please choose either wood, steel or obsidian.");
                material = scanner.next();
            }
        }

    }

    public static FletchingType getFletchingChoice() {

        System.out.println("What type of fletching would you like? Plastic, turkey or goose?");

        String material = scanner.next();
        FletchingType fletchingMaterial;

        while (true) {
            if (material.equalsIgnoreCase(FletchingType.PLASTIC.stringValue)) {
                fletchingMaterial = FletchingType.PLASTIC;
                return fletchingMaterial;
            } else if (material.equalsIgnoreCase(FletchingType.TURKEYFEATHERS.stringValue)) {
                fletchingMaterial = FletchingType.TURKEYFEATHERS;
                return fletchingMaterial;
            } else if (material.equalsIgnoreCase(FletchingType.GOOSEFEATHERS.stringValue)) {
                fletchingMaterial = FletchingType.GOOSEFEATHERS;
                return fletchingMaterial;
            } else {
                System.out.println("We don't have that material. Please choose either plastic, turkey or goose?");
                material = scanner.next();
            }
        }
    }

    public static int getLengthChoice() {

        System.out.println("How many cm do you want your arrows to be?");
        int length = scanner.nextInt();

        while (length < 60 || length > 100) {
            System.out.println("Please choose a length between 60 and 100 cm");
            length = scanner.nextInt();
        }

        return length;

    }

    public static float getCost(ArrowheadType arrowheadType, FletchingType fletchingType, int length) {

        float cost = (float) (length * 0.05);

        switch (arrowheadType) {
            case STEEL -> cost = cost + 10;
            case WOOD -> cost = cost + 3;
            case OBSIDIAN -> cost = cost + 5;

        }

        switch (fletchingType) {
            case PLASTIC -> cost = cost + 10;
            case TURKEYFEATHERS -> cost = cost + 5;
            case GOOSEFEATHERS -> cost = cost + 3;
        }

        return cost;
    }

    public static Arrow createArrow() {

        String choice = scanner.next();

        Arrow arrow = new Arrow();

        while (true) {
            if (choice.equalsIgnoreCase("Custom")) {
                ArrowheadType arrowMaterial = getArrowChoice();
                FletchingType fletchingMaterial = getFletchingChoice();
                int length = getLengthChoice();

                arrow = new Arrow(arrowMaterial, fletchingMaterial, length);
                return arrow;

            } else if (choice.equalsIgnoreCase("Elite")) {
                arrow.createEliteArrow();
                return arrow;
            } else if (choice.equalsIgnoreCase("Beginner")) {
                arrow.createBeginnerArrow();
                return arrow;
            } else if (choice.equalsIgnoreCase("Marksman")) {
                arrow.createMarksmanArrow();
                return arrow;
            } else {
                System.out.println("We do not sell that type of arrow, please choose off the menu.");
                choice = scanner.next();
            }
        }


    }
}
