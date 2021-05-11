package com.mp;

public class SystemManager {

    // Methods
    public void checkOver(boolean over, Board board) {
        int chaCount;

        if(board.getSpace(0, 3) instanceof Cha) {
            chaCount = 0;
            for(int i = 0; i <= 2; i++) {
                if(board.getSpace(i, 3) instanceof Cha)
                    chaCount++;
            }

            if(chaCount == 3)
                over = true;
        }

        if(board.getSpace(3, 1) instanceof Cha) {
            chaCount = 0;
            for(int i = 1; i <= 3; i++) {
                if(board.getSpace(3, i) instanceof Cha)
                    chaCount++;
            }

            if(chaCount == 3)
                over = true;
        }

        if(board.getSpace(3, 3) instanceof Cha) {
            chaCount = 0;
            int j = 3;
            for(int i = 3; i >= 1; i--) {
                if(board.getSpace(i, j) instanceof Cha)
                    chaCount++;

                j--;
            }

            if(chaCount == 3)
                over = true;
        }

        if(board.getSpace(3, 0) instanceof Cha) {
            chaCount = 0;
            int j = 0;
            for(int i = 3; i >= 1; i++) {
                if(board.getSpace(i, j) instanceof Cha)
                    chaCount++;

                j++;
            }

            if(chaCount == 3)
                over = true;
        }

    }
}
