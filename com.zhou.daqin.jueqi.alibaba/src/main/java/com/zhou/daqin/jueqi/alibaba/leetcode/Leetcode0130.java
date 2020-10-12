package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0130 {
    private void dfs(char[][] board, int r, int c, int rsize, int csize) {
        if (r < 0 || c < 0 || r == rsize || c == csize || board[r][c] != 'O') return;
        board[r][c] = 'P';
        dfs(board, r + 1, c, rsize, csize);
        dfs(board, r, c + 1, rsize, csize);
        dfs(board, r - 1, c, rsize, csize);
        dfs(board, r, c - 1, rsize, csize);
    }

    public void solve(char[][] board) {
        if (board.length == 0)
            return;

        int row = board.length, col = board[0].length;

        for (int i = 0; i < col; i++) {
            dfs(board, 0, i, row, col);//for FIRST ROW
            dfs(board, row - 1, i, row, col);//for LAST ROW
        }
        for (int i = 0; i < row; i++) {
            dfs(board, i, 0, row, col);//for FIRST COLUMN
            dfs(board, i, col - 1, row, col);//for LAST COLUMN
        }
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                if (board[i][j] == 'P') board[i][j] = 'O';
            }
    }
}
