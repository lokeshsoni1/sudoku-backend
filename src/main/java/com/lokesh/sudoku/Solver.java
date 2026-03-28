package com.lokesh.sudoku;

public class Solver {

    public boolean solve(int[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == 0) {

                    for (int k = 1; k <= 9; k++) {

                        if (isValid(board, i, j, k)) {

                            board[i][j] = k;

                            if (solve(board)) {
                                return true;
                            }

                            board[i][j] = 0;
                        }
                    }

                    return false;
                }
            }
        }

        return true;
    }

    public boolean isValid(int[][] board, int row, int col, int num) {

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) return false;
        }

        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) return false;
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[startRow + i][startCol + j] == num) return false;
            }
        }

        return true;
    }
}
