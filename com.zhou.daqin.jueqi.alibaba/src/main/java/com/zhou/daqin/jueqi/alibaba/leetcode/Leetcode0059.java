package com.zhou.daqin.jueqi.alibaba.leetcode;

//https://www.youtube.com/watch?v=dfGhf-Ko0L4&ab_channel=basketwangCoding
public class Leetcode0059 {
    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];
        int up = 0;
        int down = n - 1;
        int left = 0;
        int right = n - 1;

        int count = 1;
        while(up < down && left < right) {
            for(int i = left; i < right; i++) matrix[up][i] = count++;
            for(int i = up; i < down; i++) matrix[i][right] = count++;
            for(int i = right; i > left; i--) matrix[down][i] = count++;
            for(int i = down; i > up; i--) matrix[i][left] = count++;

            up++;
            left++;
            down--;
            right--;
        }
        if(n % 2 == 1) {
            matrix[up][left] = count;
        }

        return matrix;
    }
}
