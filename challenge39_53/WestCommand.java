package challenge39_53;

public class WestCommand extends RobotCommand {

    @Override
    public void run(Robot robot) {
        if (robot.getPowered() == true) {
            robot.moveX(-1);
        }
    }
}
