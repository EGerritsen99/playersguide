package challenge30;

public class CardAspects {

    /////// Fields ////////

    public enum Colours {

        RED("Red"),
        GREEN("Green"),
        BLUE("Blue"),
        YELLOW("Yellow");

        final String coloursStringValue;

        Colours(String coloursStringValue) {
            this.coloursStringValue = coloursStringValue;
        }

    }

    public enum Rank {

        ONE("One"),
        TWO("Two"),
        THREE("Three"),
        FOUR("Four"),
        FIVE("Five"),
        SIX("Six"),
        SEVEN("Seven"),
        EIGHT("Eight"),
        NINE("Nine"),
        TEN("Ten"),
        DOLLARSIGN("Dollarsign"),
        PERCENTAGE("Percentage"),
        ROOF("Roof"),
        AND("And");

        final String rankStringValue;

        Rank(String rankStringValue) {
            this.rankStringValue = rankStringValue;
        }

    }

}
