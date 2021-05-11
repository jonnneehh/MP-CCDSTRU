package com.mp;

public class Board {

    // Property
    private Space space[][];

    // Constructor
    public Board() {
        this.space = new Space[4][4];
        this.space[0][0] = new H();
        this.space[1][0] = new H();
        this.space[2][0] = new H();
        this.space[0][1] = new H();
        this.space[0][2] = new H(); 
    }

    // Method
    public void setSpace(int row, int col, Space space) {
        this.space[row][col] = space;
    }

}
