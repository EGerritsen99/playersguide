package challenge44_50.entities;

public class Maelstrom extends Entity {

    public Maelstrom(int row, int column) {
        super(row, column);
    }

    public void hitPlayer() {
        moveDown();
        moveLeft();
        moveLeft();
    }

    @Override
    public void moveRight() {

        if (getColumn() != 3) {
            setColumn(getColumn() + 1);
        }
    }

    @Override
    public void moveLeft() {

        if (getColumn() != 0) {
            setColumn(getColumn() - 1);
        }

    }

    @Override
    public void moveUp() {

        if (getRow() != 0) {
            setRow(getRow() - 1);
        }

    }

    @Override
    public void moveDown() {

        if (getRow() != 3) {
            setRow(getRow() + 1);
        }

    }

}
