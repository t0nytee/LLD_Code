package org.shruti.TicTacToe;

public class Main {
    public static void main(String[] args) {

        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.initializeGame();
        System.out.println("Game Winner is " + ticTacToeGame.playGame());

    }
}