package challenge29;

public class Colors {

    //////// Fields ////////
    int redChannel;
    int greenChannel;
    int blueChannel;

    //////// Static Colors ///////
    public final static int [] WHITE = {255, 255, 255};
    public final static int [] BLACK = {0, 0, 0};
    public final static int [] RED = {255, 0, 0};
    public final static int [] ORANGE = {255, 165, 0};
    public final static int [] YELLOW = {0, 255, 255};
    public final static int [] GREEN = {0, 128, 0};
    public final static int [] BLUE = {0, 0, 255};
    public final static int [] PURPLE = {255, 0, 255};


    //////// Constructors ////////

    public Colors() {
        redChannel = 0;
        greenChannel = 0;
        blueChannel = 0;
    }

    public Colors(int red, int green, int blue) {
        setRedChannel(red);
        setGreenChannel(green);
        setBlueChannel(blue);
    }

    public Colors(int[] staticColor) {
        setRedChannel(staticColor[0]);
        setGreenChannel(staticColor[1]);
        setBlueChannel(staticColor[2]);
    }


    ////// Methods ///////

    public int[] createNewColor() {
        int [] newColor = {redChannel, greenChannel, blueChannel};
        return newColor;
    }

    public String displayColor(){
        String display = "(" + redChannel + ", " + greenChannel + ", " + blueChannel + ")";
        return display;
    }

    ////// Getters and Setters ////////
    public int getRedChannel() {
        return redChannel;
    }

    public void setRedChannel(int redChannel) {
        this.redChannel = redChannel;
    }

    public int getGreenChannel() {
        return greenChannel;
    }

    public void setGreenChannel(int greenChannel) {
        this.greenChannel = greenChannel;
    }

    public int getBlueChannel() {
        return blueChannel;
    }

    public void setBlueChannel(int blueChannel) {
        this.blueChannel = blueChannel;
    }
}
