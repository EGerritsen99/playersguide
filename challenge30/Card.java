package challenge30;

public class Card extends CardAspects{
    /////// Fields ////////
    private Colours colour;
    private Rank rank;


    /////// Constructors ////////
    public Card() {
        colour = getColour();
        rank = getRank();
    }

    public Card(Colours colour, Rank rank) {
        setColour(colour);
        setRank(rank);
    }

    /////// Methods ////////
    public void numberOrSymbolMessage() {

        String messageSymbol = "Your card is a symbol.";
        String messageNumber = "Your card is a number.";

        if (rank.equals("$") || rank.equals("%")) {
            System.out.println(messageSymbol);
        } else if (rank.equals("^") || rank.equals("&")) {
            System.out.println(messageSymbol);
        } else {
            System.out.println(messageNumber);
        }

    }

    public String cardMessage(Card newCard) {

        String message = "The " + colour.coloursStringValue + " " + rank.rankStringValue;
        return message;
    }

    /////// Getters and Setters ////////

    public Colours getColour() {
        return colour;
    }
    public void setColour(Colours colour) {
        this.colour = colour;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

}
