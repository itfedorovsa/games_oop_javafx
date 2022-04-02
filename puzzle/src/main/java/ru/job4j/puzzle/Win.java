package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1 && (horizLine(board, index) || vertLine(board, index))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean horizLine(int[][] board, int row) {
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean vertLine(int[][] board, int cell) {
        for (int index = 0; index < board.length; index++) {
            if (board[index][cell] != 1) {
                return false;
            }
        }
        return true;
    }
}





