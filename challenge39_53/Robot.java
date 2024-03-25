package challenge39_53;

import java.util.ArrayList;

public class Robot {

    //Fields
    private int x;
    private int y;
    private boolean isPowered;
    private final ArrayList<RobotCommand> commands;

    //Constructor
    public Robot(ArrayList<RobotCommand> inputCommands) {
        commands = inputCommands;
    }

    //Methods
    public void moveX(int step) {
        if (isPowered) x += step;
    }

    public void moveY(int step) {
        if (isPowered) y += step;
    }

    public void run() {
        for (RobotCommand command : commands) {
            command.run(this);
            System.out.printf("[%d %d %b]\n", x, y, isPowered);
        }
    }

    //getters and setters
    public void setPowered(boolean powered) {
        isPowered = powered;
    }

    public boolean getPowered() {
        return isPowered;
    }


}
