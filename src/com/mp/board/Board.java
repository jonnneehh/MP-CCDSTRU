package com.mp.board;

public class Board {
    // Properties
    private Space[][] board;
    // Constructors

    public Board(){
        this.board = new Space[4][4];
        // Set H Spaces
        setSpace(0,0,new H());
        setSpace(0,1, new H());
        setSpace(0,2, new H());
        setSpace(1,0, new H());
        setSpace(2,0, new H());

        // Set Free Spaces
        setSpace(0,3, new Free());
        setSpace(1,1, new Free());
        setSpace(1,2 , new Free());
        setSpace(1,3 , new Free());
        setSpace(2,1 , new Free());
        setSpace(2,2 , new Free());
        setSpace(2,3 , new Free());
        setSpace(3,0 , new Free());
        setSpace(3,1 , new Free());
        setSpace(3,2 , new Free());
        setSpace(3,3 , new Free());
    }

    // Methods

    public void setSpace(int row, int col, Space space){
        this.board[row][col] = space;
    }
    public Space getSpace(int row, int col){
        return this.board[row][col];
    }
}
