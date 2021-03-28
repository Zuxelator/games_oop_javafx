package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        if (checkDiag(board)) {
            if (checkHor(board) || checkVert(board)) {
                rsl = true;
            }
        }
        return rsl;
    }

    public static boolean checkDiag (int[][] arr) {
        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr.length - 1 - i][i] == 1) {
                res = true;
                break;
            }
        }
        return  res;

    }

    public  static  boolean checkHor (int[][] arr) {
        boolean res = false;
        for (int[] ints : arr) {
            int counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (ints[j] == 1) {
                    counter++;
                }
            }
            if (counter == arr.length) {
                res = true;
            }
        }
        return res;
    }

    public static boolean checkVert (int[][] arr) {
        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            int counter = 0;
            for (int[] ints : arr) {
                if (ints[i] == 1) {
                    counter++;
                }
            }
            if (counter == arr.length) {
                res = true;
                break;
            }
        }
        return res;
    }
}