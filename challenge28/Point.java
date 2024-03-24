package challenge28;

public class Point {

    ////////// Fields ////////////

    private int x;
    private int y;

    ////////// Constructors ////////

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    ///////// Methods ///////

    String displayPoint() {

        String display = ("(" + x + ", " + y + ")");

        return display;

    }

    ///////// Getters and Setters ////////
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}
