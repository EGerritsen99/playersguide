package challenge30;

public class Dealer extends CardAspects{

    public static void main(String[] args) {

        for (Rank iteratedRank : Rank.values()) {
            for(Colours iteratedColour : Colours.values()) {
                Card card = new Card(iteratedColour, iteratedRank);
                String message = card.cardMessage(card);
                System.out.println(message);
            }
        }
    }

}


