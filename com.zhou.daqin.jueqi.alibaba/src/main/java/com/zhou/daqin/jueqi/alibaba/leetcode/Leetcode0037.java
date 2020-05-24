package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0037 {
    public void solveSudoku(char[][] board) {
        solveSudokuHelper(board, 0, 0);
    }


    private boolean solveSudokuHelper(char[][] board, int row, int col) {
        if (board == null || board.length != 9 || board[0].length != 9) {
            return false;
        }

        //寻找空白的元素
        while (row < 9 && col < 9) {
            if (board[row][col] == '.') {
                break;
            }
            if (col == 8) {
                col = 0;
                row++;
            } else {
                col++;
            }
        }

        if (row >= 9) {
            return true;
        }

        //下一个需要检查的坐标
        int newRow = row + col / 8;
        int newCol = (col + 1) % 9;

        //尝试填入数字，开始是错
        for (int num = 1; num <= 9; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = (char) ('0' + num);
                boolean result = solveSudokuHelper(board, newRow, newCol);
                if (result) {
                    return true;
                }
                //回溯
                board[row][col] = '.';
            }
        }

        return false;
    }

    private boolean isValid(char[][] board, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            //检查该行
            if (board[row][i] == num + '0') {
                return false;
            }
            //检查该列
            if (board[i][col] == num + '0') {
                return false;
            }
        }

        //检查所在小方格
        int rowOff = (row / 3) * 3;
        int colOff = (col / 3) * 3;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                if (board[i + rowOff][j + colOff] == num + '0') {
                    return false;
                }
            }


        return true;
    }
}
