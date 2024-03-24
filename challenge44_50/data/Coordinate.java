package challenge44_50.data;

public class Coordinate {

    private int row;
    private int column;

    public Coordinate(int row, int column) {
        setRow(row);
        setColumn(column);
    }
    public static boolean checkAdjacency(Coordinate coordinate1, Coordinate coordinate2) {

        return coordinate1.row == coordinate2.row && (coordinate1.column == coordinate2.column - 1 ||
                coordinate1.column == coordinate2.column + 1) || coordinate1.column == coordinate2.column && (coordinate1.row == coordinate2.row - 1 ||
                coordinate1.row == coordinate2.row + 1);

    }


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
