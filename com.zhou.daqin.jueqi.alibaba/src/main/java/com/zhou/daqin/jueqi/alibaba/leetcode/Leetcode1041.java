package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode1041 {
    public boolean isRobotBounded(String instructions) {
        int x=0, y = 0;
        int i = 0;
        //初始方向向北，且为顺时针方向
        int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        for(int j = 0; j < instructions.length(); j++) {
            char c = instructions.charAt(j);
            if(c == 'R') {
                i = (i + 1) % 4;
            }
            if(c == 'L') {
                i = (i + 3) % 4;
            }
            if(c == 'G') {
                x = x + dir[i][0];
                y = y + dir[i][1];
            }
        }

        return (x == 0 && y == 0) || i > 0;
    }
}
