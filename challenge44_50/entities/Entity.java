package challenge44_50.entities;

import static challenge44_50.data.Colours.ANSI_RED;
import static challenge44_50.data.Colours.ANSI_RESET;

public class Entity {

    //Fields
    private int row;
    private int column;
    protected final int size;
    private static final String wrongWay = ANSI_RED + "Can't move this way. Try something else" + ANSI_RESET;

    //Constructor
    protected Entity(int row, int column, int size) {
        setRow(row);
        setColumn(column);
        this.size = size;
    }

    // Methods
    public void moveRight() {

        if (column == size) {
            System.out.println(wrongWay);
        } else {
            setColumn(column + 1);
        }

    }
    public void moveLeft() {

        if (column == 0) {
            System.out.println(wrongWay);
        } else {
            setColumn(column - 1);
        }

    }
    public void moveUp() {

        if (row == 0) {
            System.out.println(wrongWay);
        } else {
            setRow(row - 1);
        }

    }
    public void moveDown() {

        if (row == size) {
            System.out.println(wrongWay);
        } else {
            setRow(row + 1);
        }

    }

    // Getters and setters
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }

}
