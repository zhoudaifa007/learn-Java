package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode0286 {
    public void wallsAndGates(int[][] rooms) {
        if (rooms.length == 0 || rooms[0].length == 0) return;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                if (rooms[i][j] == 0) queue.add(new int[]{i, j});
            }
        }
        while (!queue.isEmpty()) {
            int[] top = queue.remove();
            int row = top[0], col = top[1];
            if (row > 0 && rooms[row - 1][col] == Integer.MAX_VALUE) {
                rooms[row - 1][col] = rooms[row][col] + 1;
                queue.add(new int[]{row - 1, col});
            }
            if (row < rooms.length - 1 && rooms[row + 1][col] == Integer.MAX_VALUE) {
                rooms[row + 1][col] = rooms[row][col] + 1;
                queue.add(new int[]{row + 1, col});
            }
            if (col > 0 && rooms[row][col - 1] == Integer.MAX_VALUE) {
                rooms[row][col - 1] = rooms[row][col] + 1;
                queue.add(new int[]{row, col - 1});
            }
            if (col < rooms[0].length - 1 && rooms[row][col + 1] == Integer.MAX_VALUE) {
                rooms[row][col + 1] = rooms[row][col] + 1;
                queue.add(new int[]{row, col + 1});
            }
        }
    }

    public void wallsAndGates1(int[][] rooms) {
        if (rooms == null || rooms.length == 0 || rooms[0].length == 0) {
            return;
        }

        int row = rooms.length;
        int col = rooms[0].length;
        Queue<int[]> q = new LinkedList();
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++) {
                if (rooms[i][j] == 0) {
                    q.offer(new int[]{i, j});
                }
            }

        int[][] direct = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        while (!q.isEmpty()) {
            int[] num = q.poll();

            for (int i = 0; i < 4; i++) {
                int x = num[0] + direct[i][0];
                int y = num[1] + direct[i][1];
                if (x < 0 || x >= row || y < 0 || y >= col) {
                    continue;
                }
                if (rooms[x][y] == Integer.MAX_VALUE) {
                    rooms[x][y] = rooms[num[0]][num[1]] + 1;
                    q.offer(new int[]{x, y});
                }
            }
        }
    }
}