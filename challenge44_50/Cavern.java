package challenge44_50;

import challenge44_50.data.*;
import challenge44_50.entities.*;
import challenge44_50.rooms.*;

import java.util.Random;

public class Cavern {

    // Fields
    public static final FountainRoom fountainRoom = new FountainRoom();
    public static final CavernEntrance entrance = new CavernEntrance();
    private final Room[][] cavern;
    private boolean fountainOn = false;

    // Constructor
    public Cavern(int size, int amountPits, int amountMaelstroms, int amountAmaroks) {
        cavern = createNewCavern(size, amountPits, amountMaelstroms, amountAmaroks);
    }

    // Methods
    private static Room[][] getEmptyCavern (int size) {
        Room[][] emptyCavern = new Room[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++){
                emptyCavern[i][j] = new EmptyRoom();
            }
        }

        return emptyCavern;
    }
    private static Coordinate getFountainCoordinate(int size) {
        Random random = new Random();
        int row = 0;
        int column = 0;

        while (row == 0 && column == 0) {
            row = random.nextInt(0, size);
            column = random.nextInt(0, size);
        }

        return new Coordinate(row, column);
    }
    private static Coordinate getNewPitCoordinate(int size, Room[][] currentCavern) {

        Coordinate entranceCoordinate = new Coordinate(0, 0);
        Coordinate pitroomCoordinate = null;

        Random random = new Random();
        int row = 0;
        int column = 0;

        boolean nextToEntrance = false;
        while (!(currentCavern[row][column] instanceof EmptyRoom) || nextToEntrance) {

            row = random.nextInt(0, size);
            column = random.nextInt(0, size);
            pitroomCoordinate = new Coordinate(row, column);

            nextToEntrance = Coordinate.checkAdjacency(pitroomCoordinate, entranceCoordinate);

        }
        return pitroomCoordinate;
    }
    private static Maelstrom getNewMaelstrom(int size, Room[][] currentCavern) {

        Random random = new Random();
        int row = random.nextInt(0, size);
        int column = random.nextInt(0, size);

        while (currentCavern[row][column] instanceof CavernEntrance || currentCavern[row][column] instanceof FountainRoom || currentCavern[row][column].isMaelstromPresent()) {
            row = random.nextInt(0, size);
            column = random.nextInt(0, size);
        }

        return new Maelstrom(row, column, size);
    }
    private static Amarok getNewAmarok (int size, Room[][] currentCavern) {

        Random random = new Random();
        int row = random.nextInt(0, size);
        int column = random.nextInt(0, size);

        Coordinate entranceCoordinate = new Coordinate(0, 0);
        boolean nextToEntrance = false;

        while (!(currentCavern[row][column] instanceof EmptyRoom) || currentCavern[row][column].isMaelstromPresent() || nextToEntrance) {
            row = random.nextInt(0, size);
            column = random.nextInt(0, size);
            Coordinate amarokCoordinate = new Coordinate(row, column);

            nextToEntrance = Coordinate.checkAdjacency(amarokCoordinate, entranceCoordinate);
        }

        return new Amarok(row, column, size);

    }
    private static Room[][] createNewCavern(int size, int amountPits, int amountMaelstroms, int amountAmaroks) {
        // Create initial cavern with just empty rooms and add entrance
        Room[][] newCavern = getEmptyCavern(size);
        newCavern[0][0] = entrance;

        // Add fountain room
        Coordinate fountainCoordinate = getFountainCoordinate(size);
        newCavern[fountainCoordinate.getRow()][fountainCoordinate.getColumn()] = fountainRoom;

        // Add pit rooms
        for (int i = 0; i < amountPits; i++) {
            Coordinate pitCoordinate = getNewPitCoordinate(size, newCavern);
            newCavern[pitCoordinate.getRow()][pitCoordinate.getColumn()] = new PitRoom();
        }

        // instantiate new maelstroms
        for (int i = 0; i < amountMaelstroms; i++) {
            Maelstrom maelstrom = getNewMaelstrom(size, newCavern);
            newCavern[maelstrom.getRow()][maelstrom.getColumn()].addMaelstrom(maelstrom);
        }

        // instantiate new amaroks
        for (int i = 0; i < amountAmaroks; i++) {
            Amarok amarok = getNewAmarok(size, newCavern);
            newCavern[amarok.getRow()][amarok.getColumn()].addAmarok(amarok);
        }

        return newCavern;

    }

    // Getters and setters
    public Room[][] getCavern() {
        return cavern;
    }
    public boolean isFountainOn() {
        return fountainOn;
    }
    public void setFountainOn(boolean fountainOn) {
        this.fountainOn = fountainOn;
    }
}
