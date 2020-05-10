package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode0212 {

    public List<String> findWords(char[][] board, String[] words) {
        Set<String> arrayList = new HashSet<>();
        for(String word:words) {
            for (int i = 0; i < board.length; i++)
                for (int j = 0; j < board[0].length; j++) {
                    int[][] array = new int[board.length][board[0].length];
                    if (word.charAt(0) == board[i][j]) {
                        helper(i, j, board, word, "", array, arrayList);
                    }
                }
        }
        return new ArrayList<>(arrayList);
    }

    private boolean helper(int i, int j, char[][] board, String word, String cur, int[][] array, Set<String> set) {
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
                set.add(word);
                return true;
            }

            boolean flag = false;

            flag = helper(i + 1, j, board, word, cur, array, set);

            if (flag) {
                return flag;
            }

            flag = helper(i - 1, j, board, word, cur, array, set);
            if (flag) {
                return flag;
            }

            flag = helper(i, j + 1, board, word, cur, array, set);
            if (flag) {
                return flag;
            }

            flag = helper(i, j - 1, board, word, cur, array, set);
            if (flag) {
                return flag;
            }
            array[i][j] = 0;
        }
        return false;
    }
}
