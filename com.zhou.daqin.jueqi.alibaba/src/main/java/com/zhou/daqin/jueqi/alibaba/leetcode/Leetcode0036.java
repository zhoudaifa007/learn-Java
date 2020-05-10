package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0036 {

    public boolean isValidSudoku(char[][] board) {
        for( int i = 0; i < 9; i++) {
            int[] num = new int[128];
            for(int j = 0 ; j < 9 ;j++) {
                char c = board[i][j];
                if(!Character.isDigit(c)) {
                    continue;
                }
                if(num[c - '0'] == 1) {
                    return false;
                } else {
                    num[c - '0'] = 1;
                }
            }
        }

        for( int i = 0; i < 9; i++) {
            int[] num = new int[128];
            for(int j = 0 ; j < 9 ;j++) {
                char c = board[j][i];
                if(!Character.isDigit(c)) {
                    continue;
                }
                if(num[c - '0'] == 1) {
                    return false;
                } else {
                    num[c - '0'] = 1;
                }
            }
        }

        for(int i = 0; i <=6;  i = i + 3)
            for(int j = 0; j <= 6; j= j + 3) {
                int[] num = new int[128];
                for(int m = i; m < i + 3; m++) {
                    for (int n = j; n < j + 3; n++) {
                        char c = board[m][n];
                        if(!Character.isDigit(c)) {
                            continue;
                        }
                        if(num[c - '0'] == 1) {
                            return false;
                        } else {
                            num[c - '0'] = 1;
                        }
                    }
                }
            }

        return true;
    }
}
