package challenge39;

public class SouthCommand extends RobotCommand {

    @Override
    public void run(Robot robot) {
        if (robot.getPowered() == true) {
            robot.moveY(-1);
        }
    }
}
