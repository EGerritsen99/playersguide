package challenge39;

import java.util.ArrayList;
import java.util.Scanner;

public class TheOldRobot {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<RobotCommand> inputCommands = new ArrayList<RobotCommand>();
;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter a command.");
            String command = scanner.next();

            RobotCommand robotCommand = convertCommand(command);
            inputCommands.add(robotCommand);

        }

        Robot robot = new Robot(inputCommands);

        robot.run();

    }

    public static RobotCommand convertCommand(String command) {

        RobotCommand robotCommand = null;
        if (command.equalsIgnoreCase("north")) {
            robotCommand = new NorthCommand();
        }
        if (command.equalsIgnoreCase("south")) {
            robotCommand = new SouthCommand();
        }
        if (command.equalsIgnoreCase("east")) {
            robotCommand = new EastCommand();
        }
        if (command.equalsIgnoreCase("west")) {
            robotCommand = new WestCommand();
        }
        if (command.equalsIgnoreCase("on")) {
            robotCommand = new OnCommand();
        }
        if (command.equalsIgnoreCase("off")) {
            robotCommand = new OffCommand();
        }

        return robotCommand;

    }

}
