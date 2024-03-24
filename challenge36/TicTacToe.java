package challenge36;

import java.util.Scanner;

public class TicTacToe {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Players
        System.out.println("Player 1: Please enter your name.");
        String player1Name = scanner.next();

        System.out.println("Player 2: Please enter your name.");
        String player2Name = scanner.next();

        System.out.println(player1Name + ": Would you like to play with X or O?");
        String player1Choice = scanner.next();

        String player2Choice = getPlayerChoice(player1Choice);

        Player player1 = new Player(player1Name, player1Choice);
        Player player2 = new Player(player2Name, player2Choice);

        // Game
        Game game = new Game();

    while (true) {
            game.displayGame(player1Name);

            int player1Move = scanner.nextInt();
            game.makeMove(player1Move, player1Choice);

            if (game.establishGameState(player1Choice)) {
                if (game.isBoardFull()) {
                    System.out.println("It's a draw.");
                    break;
                } else {
                    game.displayGame(player2Name);

                    int player2Move = scanner.nextInt();
                    game.makeMove(player2Move, player2Choice);

                    if (!game.establishGameState(player2Choice)) {
                        System.out.println("The winner is " + player2Name);
                        break;
                    }
                }
            } else {
                System.out.println("The winner is " + player1Name);
                break;
            }

        }

    }


    public static String getPlayerChoice(String player1Choice) {

        String player2Choice;

        if (player1Choice.equalsIgnoreCase("x")) {
            player2Choice = "O";
        } else {
            player2Choice = "X";
        }

        return player2Choice;

    }


}
