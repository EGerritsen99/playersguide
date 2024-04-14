package challenge44_50.rooms;

import static challenge44_50.data.Colours.*;

public class FountainRoom extends Room {
    public FountainRoom() {
        super( ANSI_BLUE + "[ ]" + ANSI_RESET);
    }

    // Method fountain
    public boolean onOffSwitch(String input) {
        return input.equalsIgnoreCase("enable fountain");
    }
}

