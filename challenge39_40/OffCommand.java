package challenge39_40;

public class OffCommand implements RobotCommand {
    public void run(Robot robot) {
        robot.setPowered(false);
    }
}
