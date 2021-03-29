package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                if (checkHor(board, i) || checkVert(board, i)) {
                    rsl = true;
                    break;
                }
            }
        }

        return rsl;
    }

    public  static  boolean checkHor (int[][] arr, int row) {
        boolean res = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[row][i] != 1) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static boolean checkVert (int[][] arr, int cell) {
        boolean res = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][cell] != 1) {
                res = false;
                break;
            }
        }
        return res;
    }
}