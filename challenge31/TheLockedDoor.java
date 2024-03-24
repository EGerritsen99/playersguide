package challenge31;

import java.util.Scanner;

public class TheLockedDoor extends Door{

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a numeric password.");
        int initialPassword = scanner.nextInt();


        Door newDoor = new Door(initialPassword);
        DoorState doorState = DoorState.OPEN;
        newDoor.setDoorState(doorState);

        System.out.println(newDoor.getDoorState());


        while (true) {
            switch (doorState) {
                case CLOSED :
                    doorState = closedDoor(doorState);
                    break;
                case OPEN :
                    doorState = openDoor(doorState);
                    break;
                case LOCKED :
                    doorState = lockedDoor(doorState);
                    break;
            }
        }
    }

}
