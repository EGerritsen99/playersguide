package challenge39_40;

public class NorthCommand implements RobotCommand{

    public void run(Robot robot) {
        if (robot.getPowered()) {
            robot.moveY(1);
        }
    }
}
