package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.Arrays;

public class Leetcode0079 {

    public boolean exist(char[][] board, String word) {
        boolean flag = false;
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++) {
                int[][] array = new int[board.length][board[0].length];
                if(word.charAt(0) == board[i][j]) {
                    flag = helper(i, j, board, word, "", array);
                    if (flag) {
                        return true;
                    }
                }
            }

        return false;
    }

    private boolean helper(int i, int j, char[][] board, String word, String cur, int[][] array) {
        if (i >= 0 && j >= 0 && i < board.length && j < board[0].length && array[i][j] == 0) {
            cur = cur + board[i][j];
            array[i][j] = 1;

            //不匹配
            if (word.indexOf(cur) == -1) {
                array[i][j] = 0;
                return false;
            }

            //匹配上
            if (word.equals(cur)) {
                return true;
            }

            boolean flag = false;

            flag = helper(i + 1, j, board, word, cur, array);

            if (flag) {
                return flag;
            }

            flag = helper(i - 1, j, board, word, cur, array);
            if (flag) {
                return flag;
            }

            flag = helper(i, j + 1, board, word, cur, array);
            if (flag) {
                return flag;
            }

            flag = helper(i, j - 1, board, word, cur, array);
            if (flag) {
                return flag;
            }
            array[i][j] = 0;
        }
        return false;
    }
}
