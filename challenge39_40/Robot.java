package challenge39_40;

import java.util.List;

public class Robot implements RobotCommand{

    //Fields
    private int x;
    private int y;
    private boolean isPowered;

    //Methods
    public void run(Robot robot) {

    }
    public void moveX(int step) {
        if (isPowered) x += step;
    }

    public void moveY(int step) {
        if (isPowered) y += step;
    }

    private final RobotCommand[] commands = new RobotCommand[3];

    //Constructor
    public Robot(List<RobotCommand> inputCommands) {
        if (inputCommands.size() != 3) throw new IllegalArgumentException("Error: Need three commands.");
        inputCommands.toArray(commands);
    }

    //Setter
    public void setPowered(boolean powered) {
        isPowered = powered;
    }

    public boolean getPowered() {
        return isPowered;
    }

    public void run() {
        for (RobotCommand command : commands) {
            command.run(this);
            System.out.printf("[%d %d %b]\n", x, y, isPowered);
        }
    }


}
