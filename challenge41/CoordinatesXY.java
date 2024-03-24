package challenge41;

public record CoordinatesXY(int row, int collumn) {

    public static void checkAdjacency(CoordinatesXY coordinate1, CoordinatesXY coordinate2) {

        if (coordinate1.row == coordinate2.row - 1 || coordinate1.row == coordinate2.row + 1
                || coordinate1.collumn == coordinate2.collumn - 1 || coordinate1.collumn == coordinate2.collumn + 1) {

            System.out.println("Rooms are adjacent.");

        } else {

            System.out.println("Rooms are not adjacent.");

        }

    }

}
