package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0240 {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            int num = matrix[i][j];
            if (target == num) {
                return true;
            }
            if (target > num) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
