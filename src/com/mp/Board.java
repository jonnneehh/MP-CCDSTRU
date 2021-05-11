package com.mp;

public class Board {

    // Property
    private Space space[][];

    // Constructor
    public Board() {
        this.space = new Space[4][4];
        for(int i = 0; i < 4; i ++) {
            for(int j = 0; j < 4; j++) {
                this.space[i][j] = new Free();
            }
        }
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

    public Space getSpace(int row, int col) {
        return this.space[row][col];
    }

    public void printBoard() {
        System.out.println("0\t1\t2\t3");
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d\t", i);
                System.out.printf("%c\t", this.getSpace(i, j).getName());
            }
            System.out.print("\n");
        }
    }

}
