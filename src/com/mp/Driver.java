package com.mp;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        boolean over = false;
        boolean turn = true;
        int ordCount = 0;
        Board board = new Board();
        SystemManager manager = new SystemManager();
        DisplayManager display = new DisplayManager();
        Scanner sc = new Scanner(System.in);

        while(over == false) {
            display.printBoard(board);
            if(turn == true && over == false) {
                System.out.println("Cha turn:");
                System.out.print("Input row: ");
                int row = Integer.parseInt(sc.nextLine());
                System.out.print("Input column: ");
                int col = Integer.parseInt(sc.nextLine());
                board.setSpace(row, col, new Cha());

                display.printBoard(board);
                turn = !turn;

                over = manager.checkOver(board);
                if(over == true)
                    System.out.println("Cha Wins!");
            }
            if(turn == false && over == false) {
                System.out.println("Ord turn:");
                System.out.print("Input row: ");
                int row = Integer.parseInt(sc.nextLine());
                System.out.print("Input column: ");
                int col = Integer.parseInt(sc.nextLine());

                ordCount++;

                if(ordCount < 4) {
                    board.setSpace(row, col, new Ord());

                    display.printBoard(board);
                    turn = !turn;
                }
                if(ordCount == 4) {
                    board.setSpace(row, col, new Free());
                    ordCount -= 2;

                    display.printBoard(board);
                }
            }

            over = manager.checkOver(board);
            if(over == true) {
                turn = false;
                System.out.println("Ord wins!");
            }
        }
    }
}
