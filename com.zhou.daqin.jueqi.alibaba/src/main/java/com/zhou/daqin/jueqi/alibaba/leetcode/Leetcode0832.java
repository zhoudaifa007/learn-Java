package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0832 {

    public int[][] flipAndInvertImage(int[][] A) {

        int row = A.length;
        int col = A[0].length;
        for (int i = 0; i < row; i++) {
            for(int j = 0 ; j < col; j++) {
                int tmp = A[i][j];
                A[i][j] = A[i][col - 1 -j];
                A[i][col - 1 -j] = tmp;
            }

            for(int j = 0 ; j < col; j++) {
                A[i][j] = A[i][j] ^ 1;
            }
        }

        return A;
    }
}
