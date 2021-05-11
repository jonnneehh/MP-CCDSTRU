package com.mp;

public class Space {

    // Constructor

    // Methods
    public void setPos(int row, int col, Board board, boolean turn) {
        board.setSpace(row, col, this);
        turn = !turn;
    }
}
