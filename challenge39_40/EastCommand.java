package challenge39_40;

public class EastCommand implements RobotCommand {
    public void run(Robot robot) {
        if (robot.getPowered()) {
            robot.moveX(1);
        }
    }
}
