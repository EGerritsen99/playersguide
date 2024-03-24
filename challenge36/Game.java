package challenge36;

import java.util.HashMap;
import java.util.Scanner;

public class Game extends Player {

    // Fields
    private HashMap squares;
    private boolean gameOngoing;

    // Constructor
    public Game() {
        HashMap<Integer, String> initialSquares = new HashMap<Integer, String>();
        initialSquares.put(1, " ");
        initialSquares.put(2, " ");
        initialSquares.put(3, " ");
        initialSquares.put(4, " ");
        initialSquares.put(5, " ");
        initialSquares.put(6, " ");
        initialSquares.put(7, " ");
        initialSquares.put(8, " ");
        initialSquares.put(9, " ");

        setSquares(initialSquares);
    }

    // Methods
    public void displayGame(String player) {
        System.out.println("It is " + player + "'s turn.");
        System.out.println(" " + squares.get(7) + " | " + squares.get(8) + " | " + squares.get(9) + " ");
        System.out.println("---+---+---");
        System.out.println(" " + squares.get(4) + " | " + squares.get(5) + " | " + squares.get(6) + " ");
        System.out.println("---+---+---");
        System.out.println(" " + squares.get(1) + " | " + squares.get(2) + " | " + squares.get(3) + " ");
        System.out.println("What square do you want to play in?");

    }

    public void makeMove(int square, String xo) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (squares.get(square).equals(" ")) {
                squares.put(square, xo);
                break;
            } else {
                System.out.println("This square is already taken, please choose another one.");
                square = scanner.nextInt();
            }
        }
    }

    public boolean establishGameState(String playerChoice) {

        if (squares.get(1) == playerChoice && (squares.get(2) == playerChoice)) {
            if (squares.get(3) == playerChoice) {
                gameOngoing = false;
            }
        } else if (squares.get(4) == playerChoice && squares.get(5) == playerChoice) {
            if (squares.get(6) == playerChoice) {
                gameOngoing = false;
            }
        } else if (squares.get(7) == playerChoice && squares.get(8) == playerChoice) {
            if (squares.get(9) == playerChoice) {
                gameOngoing = false;
            }
        } else if (squares.get(1) == playerChoice && squares.get(4) == playerChoice) {
            if (squares.get(7) == playerChoice) {
                gameOngoing = false;
            }
        } else if (squares.get(2) == playerChoice && squares.get(5) == playerChoice) {
            if (squares.get(8) == playerChoice) {
                gameOngoing = false;
            }
        } else if (squares.get(3) == playerChoice && squares.get(6) == playerChoice) {
            if (squares.get(9) == playerChoice) {
                gameOngoing = false;
            }
        } else if (squares.get(7) == playerChoice && squares.get(5) == playerChoice) {
            if (squares.get(3) == playerChoice) {
                gameOngoing = false;
            }
        } else if (squares.get(1) == playerChoice && squares.get(5) == playerChoice) {
            if (squares.get(9) == playerChoice) {
                gameOngoing = false;
            }
        } else {
            gameOngoing = true;
        }

        return gameOngoing;

    }

    public boolean isBoardFull() {
        boolean isBoardFull;
        if (squares.containsValue(" ")) {
            return isBoardFull = false;
        } else {
            return isBoardFull = true;
        }

    }


    // Getters and setters
    public HashMap getSquares() {
        return squares;
    }

    public void setSquares(HashMap squares) {
        this.squares = squares;
    }

    public boolean isGameOngoing() {
        return gameOngoing;
    }

    public void setGameOngoing(boolean gameOngoing) {
        this.gameOngoing = gameOngoing;
    }
}

