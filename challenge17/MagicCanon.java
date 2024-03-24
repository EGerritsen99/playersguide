package challenge17;

public class MagicCanon {

    public static void main (String args[]) {

        int numberOfBlasts = 100;
        String kindOfBlast;
        String colourOfText;

        for ( int i = 0; i < numberOfBlasts; i++) {

            if ( (i+1) % 5 == 0 && (i+1) % 3 == 0) {
                kindOfBlast = "Combined blast";
                colourOfText = "\u001B[34m";
            } else if ( (i+1) % 3 == 0) {
                kindOfBlast = "Fire";
                colourOfText = "\u001B[31m";
            } else if ( (i+1) % 5 == 0) {
                kindOfBlast = "Electric";
                colourOfText = "\u001B[33m";
            } else {
                kindOfBlast = "Normal";
                colourOfText ="\u001B[32m";
            }

            System.out.println(colourOfText + (i+1) + ". " + kindOfBlast);

        }

    }

}
