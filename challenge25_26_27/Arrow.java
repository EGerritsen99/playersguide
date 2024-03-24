package challenge25_26_27;

public class Arrow {
    //////// Enums //////////
    public enum ArrowheadType{

        STEEL("Steel"),
        WOOD("Wood"),
        OBSIDIAN("Obsidian");

        final String stringValue;

        ArrowheadType(String stringValue) {
            this.stringValue = stringValue;
        }

    }
    public enum FletchingType {

        PLASTIC("Plastic"),
        TURKEYFEATHERS("Turkey"),
        GOOSEFEATHERS("Goose");

        final String stringValue;

        FletchingType(String stringValue) {
            this.stringValue = stringValue;
        }

    }

    ///////// Fields /////////
    private static ArrowheadType arrowheadType;
    private static FletchingType fletchingType;
    private static int length;

    /////// Constructor //////////

    public Arrow(){
        arrowheadType = ArrowheadType.WOOD;
        fletchingType = FletchingType.PLASTIC;
        length = 0;
    }

    public Arrow(ArrowheadType arrowheadType, FletchingType fletchingType, int length) {

        setArrowheadType(arrowheadType);
        setFletchingType(fletchingType);
        setLength(length);

    }

    ////////// Methods///////////

    public static void createEliteArrow() {
        arrowheadType = ArrowheadType.STEEL;
        fletchingType = FletchingType.PLASTIC;
        length = 95;
    }

    public static void createBeginnerArrow() {
        arrowheadType = ArrowheadType.WOOD;
        fletchingType = FletchingType.GOOSEFEATHERS;
        length = 75;
    }

    public static void createMarksmanArrow() {
        arrowheadType = ArrowheadType.STEEL;
        fletchingType = FletchingType.GOOSEFEATHERS;
        length = 65;
    }

    /////////// Getters and Setters //////
    public ArrowheadType getArrowheadType() {
        return arrowheadType;
    }

    public void setArrowheadType(ArrowheadType arrowheadType) {
        this.arrowheadType = arrowheadType;
    }

    public FletchingType getFletchingType() {
        return fletchingType;
    }

    public void setFletchingType(FletchingType fletchingType) {
        this.fletchingType = fletchingType;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
