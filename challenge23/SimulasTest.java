package challenge23;

import java.util.Scanner;

public class SimulasTest {

    enum State {
        OPEN,
        CLOSED,
        LOCKED
    }

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        State chest = State.OPEN;


        while (true) {
            switch (chest) {
                case CLOSED :
                    chest = closedChest(chest);
                    break;
                case OPEN :
                    chest = openChest(chest);
                    break;
                case LOCKED :
                    chest = lockedChest(chest);
                    break;
            }
        }
    }

    public static State closedChest(State chest) {
        System.out.println("The chest is " + chest.toString().toLowerCase() + ". What do you want to do?");
        String action = scanner.next();

        if (action.equalsIgnoreCase("open")) {

            chest = State.OPEN;

        } else if (action.equalsIgnoreCase("lock")) {

            chest = State.LOCKED;

        } else {

            System.out.println("You can only open and lock a closed chest");

        }

        return chest;

    }

    public static State openChest(State chest) {

        System.out.println("The chest is " + chest.toString().toLowerCase() + ". What do you want to do?");
        String chestState = scanner.next();

        if (chestState.equalsIgnoreCase("close")) {

            chest = State.CLOSED;

        } else {

            System.out.println("You can only close an open chest");

        }

        return chest;
    }

    public static State lockedChest(State chest) {

        System.out.println("The chest is " + chest.toString().toLowerCase() + ". What do you want to do?");
        String chestState = scanner.next();

        if (chestState.equalsIgnoreCase("unlock")) {

            chest = State.CLOSED;

        } else {

            System.out.println("You can only unlock a locked chest");

        }

        return chest;

    }

}
