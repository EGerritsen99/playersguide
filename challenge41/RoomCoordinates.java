package challenge41;

import static challenge41.CoordinatesXY.checkAdjacency;

public class RoomCoordinates {

    public static void main(String[] args) {

        CoordinatesXY coordinate1 = new CoordinatesXY(3, 5);
        CoordinatesXY coordinate2 = new CoordinatesXY(4, 4);
        CoordinatesXY coordinate3 = new CoordinatesXY(1,8);

        checkAdjacency(coordinate1, coordinate2);
        checkAdjacency(coordinate1, coordinate3);
        checkAdjacency(coordinate2, coordinate3);

    }
}
