package org.shruti.TicTacToe;

import org.shruti.TicTacToe.model.Board;
import org.shruti.TicTacToe.model.PieceType;
import org.shruti.TicTacToe.model.Player;
import org.shruti.TicTacToe.model.PlayingPieceO;
import org.shruti.TicTacToe.model.PlayingPieceX;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    public Board gameboard;
    public Deque<Player> players;

    public void initializeGame() {
        gameboard = new Board(3);

        players = new LinkedList<>();

        Player player1 = new Player("player1", new PlayingPieceX());
        Player player2 = new Player("player2", new PlayingPieceO());

        players.add(player1);
        players.add(player2);

    }

    public String playGame() {
        boolean noWinner = true;

        while(noWinner) {
            gameboard.printBoard();
            Player playerTurn = players.removeFirst();
            List<int[]> freeCells = gameboard.getFreeCells();

            if(freeCells.isEmpty()) {
                noWinner = false;
                continue;
            }

            System.out.println("Player Turn : " + playerTurn.playingPiece.pieceType + " Enter row, col : ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] val = s.split(" ");
            int row = Integer.valueOf(val[0]);
            int col = Integer.valueOf(val[1]);

            boolean result = gameboard.addPiece(row, col, playerTurn.playingPiece);
            if(result==false) {
                System.out.println("Incorrect position, Try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.add(playerTurn);
            boolean isWinner = isThereWinner(row, col, playerTurn.playingPiece.pieceType);
            if(isWinner) {
                return playerTurn.name;
            }

        }
        return  "Tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<gameboard.size;i++) {

            if(gameboard.board[row][i] == null || gameboard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gameboard.size;i++) {

            if(gameboard.board[i][column] == null || gameboard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameboard.size;i++,j++) {
            if (gameboard.board[i][j] == null || gameboard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameboard.size-1; i<gameboard.size;i++,j--) {
            if (gameboard.board[i][j] == null || gameboard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }


}
