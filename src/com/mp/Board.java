package com.mp;

public class Board {

    // Property
    private Space space[][];

    // Constructor
    public Board() {
        this.space = new Space[4][4];
    }

    // Method
    public Space setSpace(int row, int col, Space space) {
        return this.space[row][col] = space;
    }
    
}
