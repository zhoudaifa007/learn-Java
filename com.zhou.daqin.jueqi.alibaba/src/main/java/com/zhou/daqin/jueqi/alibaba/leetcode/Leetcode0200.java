package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0200 {
    public int numIslands(char[][] grid) {
        int count = 0;
        //i 是行号，j是列号
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    dfsFill(grid, i, j);
                    count++;
                }
            }
        return count;
    }

    //基于任意的一个点，将联通的1都变成0
    private void dfsFill(char[][] grid, int i, int j) {
        if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == '1') {
            grid[i][j] = '0';
            //从上往下遍历
            dfsFill(grid, i + 1, j);
            //从下往上遍历
            dfsFill(grid, i - 1, j);
            //从左往右遍历
            dfsFill(grid, i, j + 1);
            //从右往左遍历
            dfsFill(grid, i, j - 1);
        }
    }
}
