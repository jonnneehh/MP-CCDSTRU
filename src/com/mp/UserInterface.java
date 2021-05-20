package com.mp;

public class UserInterface {
	
	public void displayGameInstructions() {
		System.out.println("Instructions:");
	}
	
	public void pressAnyKeyToContinue(){ 
	        System.out.println("Press Enter key to continue...");
	        try
	        {
	            System.in.read();
	        }  
	        catch(Exception e)
	        {}  
	 }
	 
	public void displayBoard(Board board) {
		for(int row = 0; row < 4; row++)
			for(int col = 0; col < 4; col++) {
				if(board.getSpace(row, col) instanceof Ord)
					System.out.print("O ");
				else if(board.getSpace(row, col) instanceof Cha)
					System.out.print("C ");
				else if(board.getSpace(row, col) instanceof H)
					System.out.print("H ");
				else 
					System.out.print("  ");
			}
				
	}
	
	public void showWinner(boolean isChaWinner) {
		if (isChaWinner == true) {
			System.out.println("Cha is the winner!");
		}
		else 
			System.out.println("Ord is the winner!");
	}
}
