package com.mp;

import com.mp.board.*;

import java.util.*;

public class Driver {

    // scanner object
    private static Scanner sc = new Scanner(System.in);

    /* Displays message asking for row number and
     * returns the inputted number    */
    public static int getRowInput() {
        int row;
        do{
        	System.out.print("Input row: ");
    		row = Integer.parseInt(sc.nextLine());
    	}while(row <= 0 || row >= 4);
    	
        return row;
    }

    /* Displays message asking for column number and
     * returns the inputted number    */
    public static int getColInput() {
        int col;
        do {
        	System.out.print("Input column: ");
    		col = Integer.parseInt(sc.nextLine());
    	}while(col <= 0 || col >= 4);
        
        return col;
    }

    public static void main(String[] args) {

        // System Variables
        boolean over = false;
        boolean turn = true;
        int ordCount = 0;
        SystemManager systemManager = new SystemManager();
        Board board = new Board();
        UserInterface userInterface = new UserInterface();


        userInterface.displayGameInstructions(); /***No instructions written yet***/
        while(over == false) {
            //userInterface.pressAnyKeyToContinue();
            userInterface.displayBoard(board);

            if(turn == true) {

                System.out.println("Cha's Turn!");

                // Get Cha player input
                int row = getRowInput();
                int col = getColInput();

                // Check if chosen space is a Free space
                if(board.getSpace(row, col) instanceof Free) {
                    board.setSpace(row, col, new Cha());
                    turn = !turn;
                }
                else {
                    System.out.println("Not a valid space!");
                }

                // method to display board here

                // Checks if Cha has a winning position
                over = systemManager.checkChaWin(board);
            }
            else if(turn == false && over == false) {

                System.out.println("Ord's Turn!");

                // Get Ord Input
                int row = getRowInput();
                int col = getColInput();

                ordCount++;

                // executes if there are less than 4 Ord pieces on the board
                if(ordCount < 4) {
                    // Check if chosen space is a Free space
                    if(board.getSpace(row, col) instanceof Free) {
                        turn = !turn;
                        board.setSpace(row, col, new Ord());

                        // method to display board here
                    }
                    else {
                        System.out.println("Not a valid space!");
                    }
                }
                // executes if there are 4 Ord pieces on the board
                else if(ordCount == 4) {

                    // Check if chosen space is an Ord space
                    if(board.getSpace(row, col) instanceof Ord) {
                        board.setSpace(row, col, new Free());
                        ordCount -= 2;

                        // method to display board here
                    }
                    else {
                        System.out.println("Not a valid space! Must pick a space occupied by an Ord piece");
                    }
                }

                over = systemManager.checkOrdWin(board);
            }
        }
        
        userInterface.showWinner(systemManager.checkChaWin(board));
    }
}
