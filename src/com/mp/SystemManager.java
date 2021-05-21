package com.mp;
import com.mp.board.*;

public class SystemManager {

    public SystemManager() {

    }

    // Methods

    // Method checks spaces (0, 3), (1, 3), (2, 3)
    public boolean checkRightVertical(Board board) {
        int chaCount;

        if(board.getSpace(0, 3) instanceof Cha) {
            chaCount = 0;
            for(int i = 0; i <= 2; i++) {
                if(board.getSpace(i, 3) instanceof Cha)
                    chaCount++; // increments everytime a Cha Space is detected
            }

            if(chaCount == 3)
                return true;
        }

        return false;
    }

    // Method checks spaces (3, 1), (3, 2), (3, 3)
    public boolean checkBottomHorizontal(Board board) {
        int chaCount;

        if(board.getSpace(3, 1) instanceof Cha) {
            chaCount = 0;
            for(int i = 1; i <= 3; i++) {
                if(board.getSpace(3, i) instanceof Cha)
                    chaCount++; // increments everytime a Cha Space is detected
            }

            if(chaCount == 3)
                return true;
        }

        return false;
    }

    // Method checks spaces (1, 1), (2, 2), (3, 3)
    public boolean checkTopDiagonal(Board board) {
        int chaCount;

        if(board.getSpace(3, 3) instanceof Cha) {
            chaCount = 0;
            int j = 3;
            for(int i = 3; i >= 1; i--) {
                if(board.getSpace(i, j) instanceof Cha)
                    chaCount++; // increments everytime a Cha Space is detected

                j--;
            }

            if(chaCount == 3)
                return true;
        }

        return false;
    }

    // Method Checks spaces (3, 0), (2, 1), (1, 2)
    public boolean checkBottomDiagonal(Board board) {
        int chaCount;

        if(board.getSpace(3, 0) instanceof Cha) {
            chaCount = 0;
            int j = 0;
            for(int i = 3; i >= 1; i--) {
                if(board.getSpace(i, j) instanceof Cha)
                    chaCount++; // increments everytime a Cha Space is detected

                j++;
            }

            if(chaCount == 3)
                return true;
        }

        return false;
    }

    // Checks if Cha wins
    public boolean checkChaWin(Board board) {

        if(checkRightVertical(board) == true) return true;
        if(checkBottomHorizontal(board) == true) return true;
        if(checkBottomDiagonal(board) == true) return true;
        if(checkTopDiagonal(board) == true) return true;

        return false;
    }

    // Method checks if there are no more Free spaces
    public boolean checkOrdWin(Board board) {
        int freeCount = 0;

        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(board.getSpace(i, j) instanceof Free) {
                    freeCount++; // increments everytime a Free Space is detected
                }
            }
        }

        if(freeCount == 0 && checkChaWin(board) == false)
            return true;

        return false;
    }

}
