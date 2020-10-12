package com.zhou.daqin.jueqi.alibaba.nowcoder;

import com.alibaba.fastjson.JSONObject;

public class FlipArray {
    public int[][] flipChess(int[][] A, int[][] f) {
        // write code here
        int[][] dir = {{1,0},{-1,0},{0,-1},{0,1}};

        int fl = f.length;

        for(int i = 0 ; i < fl; i++) {
            int r = f[i][0] - 1;
            int c = f[i][1] - 1;

            for(int j=0; j < dir.length; j++) {
               int r1 = r + dir[j][0];
               int c1 = c + dir[j][1];

                if(r >=0 && r < A.length && c>=0 && c < A[0].length) {
                    A[r1][c1] = 1 - A[r1][c1];
                }
            }
        }
        return A;
    }
}
