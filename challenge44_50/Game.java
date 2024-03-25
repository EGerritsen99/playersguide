package challenge44_50;

import challenge44_50.data.*;
import challenge44_50.entities.*;
import challenge44_50.rooms.*;
import static challenge44_50.data.Colours.*;

public class Game {

    // Fields
    private final Cavern cavern;
    private Room currentRoom;
    private final Player player;
    private final int size;

    // Constructor
    public Game(int size, int amountPits, int amountMaelstroms, int amountAmaroks) {

        cavern = new Cavern(size, amountPits, amountMaelstroms, amountAmaroks);
        player = new Player(size);
        currentRoom = cavern.getCavern()[0][0];
        this.size = size;

    }

    // Methods
    public void maelstromAttack() {

        Maelstrom maelstrom = currentRoom.getMaelstrom();
        maelstrom.hitPlayer();
        currentRoom.removeMaelstrom();
        cavern.getCavern()[maelstrom.getRow()][maelstrom.getColumn()].addMaelstrom(maelstrom);

        Coordinate newPosition = player.getHitByMaelstrom();

        Room newCurrentRoom = cavern.getCavern()[newPosition.getRow()][newPosition.getColumn()];
        setCurrentRoom(newCurrentRoom);

        System.out.println(ANSI_RED + "You were hit by a Maelstrom! You moved one room north and two rooms east." + ANSI_RESET);

    }
    public void shootArrow(String direction) {

        if (player.getAmountOfArrows() > 0) {
            Coordinate roomCoordinate = player.shootArrow(direction);
            Room room = cavern.getCavern()[roomCoordinate.getRow()][roomCoordinate.getColumn()];

            if (room.isAmarokPresent()) {
                room.removeAmarok();
                System.out.println(ANSI_GREEN + "\n*** You hit an amarok. Good job! ***"+ ANSI_RESET);
            } else if (room.isMaelstromPresent()) {
                room.removeMaelstrom();
                System.out.println(ANSI_GREEN + "\n*** You hit a maelstrom. Good job! ***"+ ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + "\n*** Missed. ***");
            }
        } else {
            System.out.println(ANSI_RED + "\nYou don't have any more arrows!" + ANSI_RESET);
        }

    }

    // Display
    private String getWarningMessage(int size) {

        Coordinate currentCoordinates = new Coordinate(player.getRow(), player.getColumn());
        StringBuilder message = new StringBuilder();

        // check adjacency and set message
        for (int outer = 0; outer < size; outer++) {
            for (int inner = 0; inner < size; inner++){
                //Check pitroom adjacency
                if (cavern.getCavern()[inner][outer] instanceof PitRoom) {
                    Coordinate pitCoorditate = new Coordinate(inner, outer);

                    if (Coordinate.checkAdjacency(currentCoordinates, pitCoorditate)) {
                        message.append("\nYou feel a draft. There is a pit in a nearby room.");
                    }
                }
                //Check maelstrom adjacency
                if (cavern.getCavern()[inner][outer].isMaelstromPresent()) {
                    Coordinate maelstromCoordinate = new Coordinate(inner, outer);
                    if (Coordinate.checkAdjacency(currentCoordinates, maelstromCoordinate)){
                        message.append("\nYou hear the growling and groaning of a maelstrom nearby.");
                        break;
                    }
                }

                //Check amarok adjacency
                if (cavern.getCavern()[inner][outer].isAmarokPresent()) {
                    Coordinate amarokCoordinate = new Coordinate(inner, outer);
                    if (Coordinate.checkAdjacency(currentCoordinates, amarokCoordinate)){
                        message.append("\nYou can smell the rotten stench of an amarok in a nearby room.");
                        break;
                    }
                }
            }
        }

        return message.toString();

    }
    public String getRoomMessage(){
        String message = "";
        if (currentRoom instanceof FountainRoom) {
            if (cavern.isFountainOn()) {
                message = ANSI_BLUE + "\nYou hear the rushing waters from the Fountain of Objects. It has been reactivated!" + ANSI_RESET;
            } else {
                message = ANSI_BLUE + "\nYou hear water dripping in this room. The Fountain of Objects if here!" + ANSI_RESET;
            }
        } else if (currentRoom instanceof CavernEntrance){
            message = ANSI_YELLOW + "\nYou see light in this room, coming from outside the cavern, this is the entrance." + ANSI_RESET;
        } else if (currentRoom instanceof PitRoom) {
            message = ANSI_RED + "\nYou fell into a pit and died." + ANSI_RESET;
        } else if (currentRoom.isAmarokPresent()) {
            message = ANSI_RED + "\nYou were killed by an amarok." + ANSI_RESET;
        }

        return message;
    }
    private String getStatsMessage() {
        return "_____________________________________________________________________________________________________"
                + "\nYou are in row: " + player.getRow() + " column: " + player.getColumn()
                + "\nArrows: " + player.getAmountOfArrows();
    }
    public void displayMessage() {

        String message = ANSI_CYAN + getStatsMessage() + ANSI_RESET + getRoomMessage() + ANSI_RED + getWarningMessage(size) + ANSI_RESET;
        System.out.println(message);

    }
    public void displayGame() {

        for (int outer = 0; outer < size; outer++) {
            System.out.println();
            for (int inner = 0; inner < size; inner++) {

                Room roomToDisplay = cavern.getCavern()[outer][inner];
                String display = roomToDisplay.getDisplay();

                if (roomToDisplay.isMaelstromPresent()) {
                    display = display.replace(" ", "M");
                }

                if(roomToDisplay == currentRoom) {
                    display = display.replace(" ", "P");
                }

                if (roomToDisplay.isAmarokPresent()) {
                    display = display. replace(" ", "A");
                }

                System.out.print(display);

            }

        }

    }

    // Moving
    public void moveRight() {

        player.moveRight();
        setCurrentRoom(cavern.getCavern()[player.getRow()][player.getColumn()]);

    }
    public void moveLeft() {

        player.moveLeft();
        setCurrentRoom(cavern.getCavern()[player.getRow()][player.getColumn()]);

    }
    public void moveUp() {

        player.moveUp();
        setCurrentRoom(cavern.getCavern()[player.getRow()][player.getColumn()]);

    }
    public void moveDown() {

        player.moveDown();
        setCurrentRoom(cavern.getCavern()[player.getRow()][player.getColumn()]);

    }

    //Getters and setters
    public Room getCurrentRoom() {
        return currentRoom;
    }
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
    public Cavern getCavern() {
        return cavern;
    }

}
