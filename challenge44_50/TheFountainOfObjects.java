package challenge44_50;

import challenge44_50.rooms.*;
import static challenge44_50.data.Colours.*;
import java.util.Scanner;

public class TheFountainOfObjects {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        displayGameRules();
        getListOfCommands();

        Game game = getNewGame();

        game.displayMessage();

        playGame(game);

        boolean playAgain = getPlayAgain();

        while (playAgain) {

            Game anotherGame = getNewGame();
            playGame(anotherGame);
            playAgain = getPlayAgain();

        }

    }
    public static void playGame(Game game) {

        while (true) {

//            game.displayGame();

            System.out.println(ANSI_PURPLE + "\nEnter your move." + ANSI_RESET);
            String input = scanner.nextLine();

            makeMove(input, game);


            if (game.getCurrentRoom() instanceof CavernEntrance && game.getCavern().isFountainOn()) {
                System.out.println(ANSI_GREEN
                        + "*********"
                        + " You won! "
                        + "*********" + ANSI_RESET);
                break;
            } else if (game.getCurrentRoom().isMaelstromPresent()) {
                game.maelstromAttack();
                if (game.getCurrentRoom() instanceof PitRoom || game.getCurrentRoom().isAmarokPresent()) {
                    System.out.println(game.getRoomMessage());
                    break;
                }
            } else if (game.getCurrentRoom().isAmarokPresent() || game.getCurrentRoom() instanceof PitRoom ) {
                System.out.println(game.getRoomMessage());
                break;
            }
            game.displayMessage();

        }

    }
    public static void makeMove(String input, Game game) {

        input = input.toLowerCase();
        boolean repeat;

         do {

             repeat = false;

             switch (input) {

                 case "move east" :
                     game.moveRight();
                     break;
                 case "move west" :
                     game.moveLeft();
                     break;
                 case "move north" :
                     game.moveUp();
                     break;
                 case "move south" :
                     game.moveDown();
                     break;
                 case "shoot east" :
                 case "shoot west" :
                 case "shoot north" :
                 case "shoot south" :
                     game.shootArrow(input);
                     break;
                 case "enable fountain" :
                 case "disable fountain" :
                     if (game.getCurrentRoom() instanceof FountainRoom) {
                         game.getCavern().setFountainOn(Cavern.fountainRoom.onOffSwitch(input));
                     } else {
                         System.out.println(ANSI_RED + "You are not currently in the fountain room." + ANSI_RESET);
                         input = scanner.nextLine();
                     }
                     break;
                 case "help" :
                     getListOfCommands();
                     break;
                 default :
                     System.out.println(ANSI_RED + "Invalid input, please try something else." + ANSI_RESET);
                     input = scanner.nextLine();
                     repeat = true;

             }

        } while (repeat);

    }
    public static Game getNewGame() {
        System.out.println("Do you want to play a small, medium or large game?");
        String choice = scanner.next();
        scanner.nextLine();
        Game newGame = null;

        while (newGame == null) {

            switch (choice.toLowerCase()) {

                case "small" :
                    newGame = new Game(4, 1, 1, 1);
                    break;
                case "medium" :
                    newGame = new Game(6, 2, 1, 2);
                    break;
                case "large" :
                    newGame = new Game(8, 4, 2, 3);
                    break;
                default:
                    System.out.println(ANSI_RED + "Input invalid, please enter small, medium or large" + ANSI_RESET);
                    choice = scanner.next();
                    scanner.nextLine();
            }

        }

        return newGame;

    }
    public static boolean getPlayAgain() {
        System.out.println("Would you like to play again?");
        String yesNo = scanner.next();
        scanner.nextLine();

        while (!yesNo.equalsIgnoreCase("yes") && !yesNo.equalsIgnoreCase("no")) {
            System.out.println("Input invalid, enter either yes or no.");
            yesNo = scanner.next();
            scanner.nextLine();
        }

        return yesNo.equalsIgnoreCase("yes");

    }
    public static void displayGameRules() {

        String display = ANSI_CYAN
                + "\n_____________________________________________________________________________________________________"
                + "\nYou enter the Cavern of Objects, a maze of rooms filled with dangerous pits in search"
                + "of the Fountain of Objects."
                + "\nLight is visible only in the entrance, and no other light is seen anywhere in the caverns."
                + "\nYou must navigate the Caverns with your other senses."
                + "\nFind the Fountain of Objects, activate it, and return to the entrance."
                + "\nLook out for pits. You will feel a breeze if a pit is in an adjacent room. If you enter a room with a pit, you will die"
                + "\nMaelstroms are violent forces of sentient wind. Entering a room with one could transport you to any other location"
                + "in the caverns. You will be able to hear their growling and groaning in nearby rooms"
                + "\nAmaroks roam the caverns. Encountering one is certain death, but you can smell their rotten stench in nearby rooms."
                + "\nYou carry with you a bow and a quiver of arrows. You can use them to shoot monsters in the caverns but be warned: you have a limited supply."
                + "\n_____________________________________________________________________________________________________"
                + ANSI_RESET;

        System.out.println(display);
    }
    public static void getListOfCommands() {
        String display = ANSI_BLUE
                + "\n_____________________________________________________________________________________________________"
                + "\nEnter move east, west, north and south to move one room over in the cavern."
                + "\nEnter shoot east, west, north and south to shoot one arrow in a room next to you."
                + "\nEnter enable or disable fountain to enable or disable the fountain while in the fountain room."
                + "\nEnter help to display this list again."
                + "\n_____________________________________________________________________________________________________"
                + ANSI_RESET;

        System.out.println(display);
    }
}
