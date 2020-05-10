package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0063 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //总行数
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;
        int[][] array = new int[n][m];

        boolean flag = true;
        for( int i =0 ;i < m; i++) {
            if (obstacleGrid[0][i] == 1) {
                flag = false;
            }
            if(flag) {
                array[0][i] = 1;
            } else {
                array[0][i] = 0;
            }
        }

        boolean flag1 = true;
        for(int j = 0; j < n; j++) {
            if(obstacleGrid[j][0] == 1) {
                flag1 = false;
            }
            if(flag1) {
                array[j][0] = 1;
            } else {
                array[j][0] = 0;
            }
        }

        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(obstacleGrid[i][j] == 0) {
                    if(obstacleGrid[i - 1] [j] == 0) {
                        array[i][j] += array[i -1][j] ;
                    }
                    if(obstacleGrid[i][j - 1] == 0) {
                        array[i][j] += array[i][j - 1] ;
                    }
                }
            }
        }
        return array[n- 1][m -1];
    }
}
