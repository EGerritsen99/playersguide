package challenge44_50.entities;

public class Maelstrom extends Entity {
    private final int size;
    public Maelstrom(int row, int column, int size) {
        super(row, column, size);
        this.size = size;
    }

    public void hitPlayer() {
        moveDown();
        moveLeft();
        moveLeft();
    }

    @Override
    public void moveRight() {

        if (getColumn() != size) {
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

        if (getRow() != size) {
            setRow(getRow() + 1);
        }

    }

}
