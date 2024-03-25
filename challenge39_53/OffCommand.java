package challenge39_53;

public class OffCommand extends RobotCommand {

    @Override
    public void run(Robot robot) {
        robot.setPowered(false);
    }
}
