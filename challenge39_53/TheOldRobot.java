package challenge39_53;

import java.util.ArrayList;
import java.util.Scanner;

public class TheOldRobot {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<RobotCommand> inputCommands = new ArrayList<>();

        while (true) {
            System.out.println("Enter a command. Enter 'stop' to stop giving commands.");
            String command = scanner.next();

            if (command.equalsIgnoreCase("stop")) {
                break;
            }

            RobotCommand robotCommand = convertCommand(command);

            while(robotCommand == null) {
                System.out.println("Input invalid. Try something else.");
                command = scanner.next();
                robotCommand = convertCommand(command);
            }

            inputCommands.add(robotCommand);

        }

        Robot robot = new Robot(inputCommands);
        robot.run();

    }

    public static RobotCommand convertCommand(String command) {
        return switch (command) {
            case "north" -> new NorthCommand();
            case "south" -> new SouthCommand();
            case "east" -> new EastCommand();
            case "west" -> new WestCommand();
            case "on" -> new OnCommand();
            case "off" -> new OffCommand();
            default -> null;
        };

    }

}
