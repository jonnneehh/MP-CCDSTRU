package com.mp;
import com.mp.board.*;

public class UserInterface {
	
	//Displays instructions of the game
	public void displayGameInstructions() {
		System.out.println("Instructions:");
	}
	
	//Enter key must be pressed for user to continue
	public void pressEnterToContinue(){ 
		System.out.println("Press enter to continue...");
		
		try{        
			System.in.read();
			System.in.read();
		}
		
		catch(Exception e){	
			e.printStackTrace();
		}
	 }
	
	public void clearScreen() {  
		
	}
	
	//Displays 2d array board by checking what is the instance from getSpace
	public void displayBoard(Board board) {
		System.out.print("  1 2 3 4\n");
		for(int row = 0; row < 4; row++) {
			System.out.printf("%d ", row + 1);
			for (int col = 0; col < 4; col++) {
				if (board.getSpace(row, col) instanceof Ord)
					System.out.print("O ");
				else if (board.getSpace(row, col) instanceof Cha)
					System.out.print("C ");
				else if (board.getSpace(row, col) instanceof H)
					System.out.print("H ");
				else
					System.out.print("- ");
			}
			System.out.print("\n");
		}
	}
	
	//Shows the winner using checkChaWin from system manager
	public void showWinner(boolean isChaWinner) {
		if (isChaWinner == true) {
			System.out.println("Cha is the winner!");
		}
		else 
			System.out.println("Ord is the winner!");
	}
}
