package com.mp;

public class Board {

    // Property
    private Space space[][];

    // Constructor
    public Board() {
        this.space = new Space[4][4];
    }

    // Method
    public Space getSpace(int row, int col) {
        return this.space[row][col];
    }

}
