package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0695 {

    private int curArea;

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;

        if(grid.length == 0) {
            return 0;
        }

        int row = grid.length;
        int col = grid[0].length;

        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++) {
                curArea = 0;
                if(grid[i][j] == 1) {
                    dfs(grid, i, j, row, col);
                }
                maxArea = Math.max(maxArea, curArea);
            }

        return maxArea;
    }

    private void dfs(int[][] grid, int i, int j, int row, int col) {

        if(i >=0 && i < row && j >=0 && j < col && grid[i][j] == 1) {
            curArea++;
            grid[i][j] = 0;
            dfs(grid, i+1,j, row, col);
            dfs(grid, i- 1,j, row, col);
            dfs(grid, i,j + 1, row, col);
            dfs(grid, i,j - 1, row, col);
        }

    }



}
