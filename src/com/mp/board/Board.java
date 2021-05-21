package com.mp.board;

public class Board {
    // Properties
    private Space[][] board;
    // Constructors

    public Board(){
        this.board = new Space[4][4];

        // Set Free Spaces
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                setSpace(i, j, new Free());
            }
        }

        // Set H Spaces
        for(int i = 0; i <= 2; i++) {
            setSpace(0, i, new H());
        }

        for(int i = 0; i <= 2; i++) {
            setSpace(i, 0, new H());
        }
    }

    // Methods

    public void setSpace(int row, int col, Space space){
        this.board[row][col] = space;
    }
    public Space getSpace(int row, int col){
        return this.board[row][col];
    }
}
