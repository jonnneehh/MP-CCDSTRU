package com.mp;

public class Ord extends Space {

    // Methods
    public void setPos(int count, int row, int col, Board board, boolean turn) {
        if(count < 4) {
            count++;
            board.setSpace(row, col, this);
            turn = !turn;
        }
        if(count == 4) {
            count -= 2;
            board.setSpace(row, col, new Free());
        }
    }
}
