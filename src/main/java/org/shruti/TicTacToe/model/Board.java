package org.shruti.TicTacToe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {

    public  int size;
    public PlayingPiece[][] board;
    public Board(int s) {
        this.size = s;
        this.board = new PlayingPiece[s][s];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece) {
        if(board[row][col] !=null) {
            return false;
        }
        board[row][col] = playingPiece;
        return true;
    }

    public void printBoard() {
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                if(board[i][j] == null) {
                    System.out.print("   ");
                } else {
                    System.out.print(board[i][j].pieceType + "  ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public List<int[]> getFreeCells() {
        List<int[]> freeCells = new ArrayList<>();
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                if(board[i][j] == null) {
                    freeCells.add(new int[]{i,j});
                }
            }
        }
        return freeCells;
    }

}
