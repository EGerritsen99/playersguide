package challenge31;


import java.util.Scanner;

public class Door {

    ///// Fields ////
    enum DoorState {
        OPEN,
        CLOSED,
        LOCKED
    }

    private static DoorState doorState;

    private static int password;

    ////// Constructors //////
    public Door() {
        getPassword();
    }

    public Door(int password) {
        setPassword(password);
    }

    ////// Methods //////
    public static DoorState closedDoor(DoorState doorState) {
        System.out.println("The door is " + doorState.toString().toLowerCase() + ". What do you want to do?");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.next();

        if (action.equalsIgnoreCase("open")) {

            doorState = DoorState.OPEN;

        } else if (action.equalsIgnoreCase("lock")) {

            doorState = DoorState.LOCKED;

        } else {

            System.out.println("You can only open and lock a closed door");

        }

        return doorState;

    }

    public static DoorState openDoor(DoorState doorState) {

        System.out.println("The door is " + doorState.toString().toLowerCase() + ". What do you want to do?");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.next();

        if (action.equalsIgnoreCase("close")) {

            doorState = DoorState.CLOSED;

        } else {

            System.out.println("You can only close an open door");

        }

        return doorState;
    }

    public static DoorState lockedDoor(DoorState doorState) {

        System.out.println("The door is " + doorState.toString().toLowerCase() + ". What do you want to do?");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.next();

        if (action.equalsIgnoreCase("unlock")) {

            doorState = getPasswordGuess();

        } else {

            System.out.println("You can only unlock a locked door");

        }

        return doorState;
    }

    public static DoorState getPasswordGuess () {

        System.out.println("Please enter the password.");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        while (true) {
            if (guess == password) {
                System.out.println("Password correct.");
                doorState = DoorState.CLOSED;
                break;
            } else {
                System.out.println("Password incorrect. please try again.");
                guess = scanner.nextInt();
            }
        }

        return doorState;

    }

    public static void changePassword() {

        System.out.println("Please enter the old password.");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        while (true) {
            if (guess == password) {
                System.out.println("Password correct. Enter the new password.");
                password = scanner.nextInt();
            } else {
                System.out.println("Password incorrect. please try again.");
                guess = scanner.nextInt();
            }
        }

    }


    //// Getters and Setters ////
    public DoorState getDoorState() {
        return doorState;
    }

    public void setDoorState(DoorState doorState) {
        this.doorState = doorState;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}

