package com.zhou.daqin.jueqi.alibaba.leetcode;

public class TestMuss {

    public boolean exist(char[][] board, String word) {

        boolean flag = false;

        int R = board.length;
        int C = board[0].length;

        for(int i = 0 ;i < R; i++) {
            for(int j = 0; j < C; j++) {
                if(board[i][j] == word.charAt(0)) {

                    if(flag) {
                        return flag;
                    }
                }
            }
        }

        return flag;
    }

    private boolean dfs(char[][] b, int i, int j, int R, int C, String cur, String word) {
        if(i < 0 || i >= R  || j < 0 || j >= C) {
            return false;
        }

        cur = cur + b[i][j];

        if(cur.equals(word)) {
            return true;
        }

        boolean flag = dfs(b, i + 1, j, R, C, cur, word);
        if(flag) {
            return true;
        }

        flag = dfs(b, i - 1, j, R, C, cur, word);

        if(flag) {
            return true;
        }


        flag = dfs(b, i , j+ 1, R, C, cur, word);
        if(flag) {
            return true;
        }

        flag = dfs(b, i , j -  1, R, C, cur, word);

        return flag;
    }
}
