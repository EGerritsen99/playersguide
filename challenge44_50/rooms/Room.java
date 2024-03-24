package challenge44_50.rooms;

import challenge44_50.entities.*;

public abstract class Room {

    // Fields
    private String display;

    private Maelstrom maelstrom;
    private Amarok amarok;

    private boolean maelstromPresent;
    private boolean amarokPresent;

    // Constructor
    public Room(String display) {
        setDisplay(display);
    }

    // Methods
    public void addMaelstrom(Maelstrom maelstrom) {
        setMaelstrom(maelstrom);
        setMaelstromPresent(true);
    }
    public void removeMaelstrom() {
        setMaelstrom(null);
        setMaelstromPresent(false);
    }
    public void addAmarok(Amarok amarok) {
        setAmarok(amarok);
        setAmarokPresent(true);
    }
    public void removeAmarok() {
        setAmarok(null);
        setAmarokPresent(false);
    }

    // Getters and setters
    public String getDisplay() {
        return display;
    }
    public void setDisplay(String display) {
        this.display = display;
    }

    // Maelstrom getters and setters
    public boolean isMaelstromPresent() {
        return maelstromPresent;
    }
    public void setMaelstromPresent(boolean maelstromPresent) {
        this.maelstromPresent = maelstromPresent;
    }
    public Maelstrom getMaelstrom() {
        return maelstrom;
    }
    public void setMaelstrom(Maelstrom maelstrom) {
        this.maelstrom = maelstrom;
    }

    // Amarok getters and setters
    public Amarok getAmarok() {
        return amarok;
    }
    public void setAmarok(Amarok amarok) {
        this.amarok = amarok;
    }
    public boolean isAmarokPresent() {
        return amarokPresent;
    }
    public void setAmarokPresent(boolean amarokPresent) {
        this.amarokPresent = amarokPresent;
    }

}
