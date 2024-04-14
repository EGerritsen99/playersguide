package challenge44_50.entities;

import challenge44_50.data.*;

public class Player extends Entity {

    //Fields
    private int amountOfArrows = 5;

    //Constructor
    public Player(int size) {
        super(0, 0, size);
    }

    //Methods
    public Coordinate getHitByMaelstrom() {

        // Move north
        if (getRow() > 0) {
            moveUp();
        }

        // Move east twice
        for (int i = 0; i < 2; i++) {
            if (getColumn() < size){
                moveRight();
            } else {
                break;
            }
        }

        return new Coordinate(getRow(), getColumn());

    }
    public Coordinate shootArrow(String direction) {

        setAmountOfArrows(amountOfArrows - 1);

        return switch (direction) {
            case "shoot east" -> new Coordinate(getRow(), getColumn() + 1);
            case "shoot west" -> new Coordinate(getRow(), getColumn() - 1);
            case "shoot north" -> new Coordinate(getRow() - 1, getColumn());
            case "shoot south" -> new Coordinate(getRow() + 1, getColumn());
            default -> null;
        };

    }

    // Getters and setters
    public int getAmountOfArrows() {
        return amountOfArrows;
    }
    public void setAmountOfArrows(int amountOfArrows) {
        this.amountOfArrows = amountOfArrows;
    }

}
