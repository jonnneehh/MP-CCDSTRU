package com.mp;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        boolean over = false;
        boolean turn = true;
        int ordCount = 0;
        Board board = new Board();
        SystemManager manager = new SystemManager();
        Scanner sc = new Scanner(System.in);

        do {
            board.printBoard();
            if(turn == true) {
                System.out.println("Cha turn:");
                System.out.print("Input row: ");
                int row = Integer.parseInt(sc.nextLine());
                System.out.print("Input column: ");
                int col = Integer.parseInt(sc.nextLine());
                board.setSpace(row, col, new Cha());

                board.printBoard();
                turn = !turn;
            }
            else {
                System.out.println("Ord turn:");
                System.out.print("Input row: ");
                int row = Integer.parseInt(sc.nextLine());
                System.out.print("Input column: ");
                int col = Integer.parseInt(sc.nextLine());

                ordCount++;

                if(ordCount < 4) {
                    board.setSpace(row, col, new Ord());

                    board.printBoard();
                    turn = !turn;
                }
                if(ordCount == 4) {
                    board.setSpace(row, col, new Free());
                    ordCount -= 2;

                    board.printBoard(); 

                    System.out.println("Ord pick new space:");
                    System.out.print("Input row: ");
                    row = Integer.parseInt(sc.nextLine());
                    System.out.print("Input column: ");
                    col = Integer.parseInt(sc.nextLine());
                }
            }

        } while(over = false);
    }
}
