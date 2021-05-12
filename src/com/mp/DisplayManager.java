package com.mp;

public class DisplayManager {

    // Methods
    public void printBoard(Board board) {
        System.out.println("\n\t0\t1\t2\t3");
        for(int i = 0; i < 4; i++) {
            System.out.printf("%d\t", i);
            for (int j = 0; j < 4; j++) {
                System.out.printf("%c\t", board.getSpace(i, j).getName());
            }
            System.out.print("\n");
        }
    }
}
