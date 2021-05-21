package com.mp;

import com.mp.board.*;

import java.util.*;

public class Driver {

    // scanner object
    private static Scanner sc = new Scanner(System.in);

    /* Displays message asking for row number and
     * returns the inputted number    */
    public static int getRowInput() {
<<<<<<< HEAD
        System.out.print("Input row: ");
        return Integer.parseInt(sc.nextLine()) - 1;
=======
        int row;
        do{
        	System.out.print("Input row: ");
    		row = Integer.parseInt(sc.nextLine());
    	}while(row <= 0 || row >= 4);
    	
        return row;
>>>>>>> 1e0baecfb13304f9a6c28a4b21520f16e3ad368f
    }

    /* Displays message asking for column number and
     * returns the inputted number    */
    public static int getColInput() {
<<<<<<< HEAD
        System.out.print("Input column: ");
        return Integer.parseInt(sc.nextLine()) - 1;
=======
        int col;
        do {
        	System.out.print("Input column: ");
    		col = Integer.parseInt(sc.nextLine());
    	}while(col <= 0 || col >= 4);
        
        return col;
>>>>>>> 1e0baecfb13304f9a6c28a4b21520f16e3ad368f
    }

    public static void main(String[] args) {

        // System Variables
        boolean over = false;
        boolean turn = true;
        SystemManager systemManager = new SystemManager();
        Board board = new Board();
        UserInterface userInterface = new UserInterface();

<<<<<<< HEAD
        userInterface.displayGameInstructions(); /***No instructions written yet***/
        userInterface.pressAnyKeyToContinue();

        while(over == false) {

=======

        userInterface.displayGameInstructions(); /***No instructions written yet***/

        while(!over) {

            //userInterface.pressAnyKeyToContinue();
>>>>>>> 1e0baecfb13304f9a6c28a4b21520f16e3ad368f
            userInterface.displayBoard(board);

            if(turn) {

                System.out.println("Cha's Turn!");

                // Get Cha player input
                int row = getRowInput();
                int col = getColInput();

                // Check if chosen space is a Free space
                if(board.getSpace(row, col) instanceof Free) {
                    board.setSpace(row, col, new Cha());
                    turn = false;
                }
                else {
                    System.out.println("Not a valid space!");
                }

                // method to display board here

                // Checks if Cha has a winning position
                over = systemManager.checkChaWin(board);
            }
            else if(!turn && !over) {

                System.out.println("Ord's Turn!");

                // Get Ord Input
                int row = getRowInput();
                int col = getColInput();

<<<<<<< HEAD
                // executes if there are less than 4 Ord pieces on the board
                if(systemManager.countOrd(board) < 3) {

                    // Check if chosen space is a Free space
                    if(board.getSpace(row, col) instanceof Free) {

=======
                ordCount++;

                // executes if there are less than 4 Ord pieces on the board
                if(ordCount < 4) {
                    // Check if chosen space is a Free space
                    if(board.getSpace(row, col) instanceof Free) {
                        turn = false;
>>>>>>> 1e0baecfb13304f9a6c28a4b21520f16e3ad368f
                        board.setSpace(row, col, new Ord());
                        turn = !turn;

                        // method to display board here
                    }
                    else {
                        System.out.println("Not a valid space!");
                    }
                }
                // executes if there are 4 Ord pieces on the board
                else if(systemManager.countOrd(board) == 3) {

                    // Check if chosen space is an Ord space
                    if(board.getSpace(row, col) instanceof Ord) {
                        board.setSpace(row, col, new Free());

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
