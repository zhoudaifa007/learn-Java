package com.zhou.daqin.jueqi.alibaba.collection;

/**
 * Created by Daifa on 2018/4/14.
 */
public class Matrix {


    public int[][] Multiply(int[][] a, int[][] b) {
        int c[][] = new int[a.length][b[0].length];

        int x, i, j;
        //对a按行遍历
        for (i = 0; i < a.length; i++) {
            //对b按列遍历
            for (j = 0; j < b[0].length; j++) {
                int temp = 0;
                //对a按行遍历，对b按列遍历
                for (x = 0; x < b.length; x++) {
                    temp += a[i][x] * b[x][j];

                }
                c[i][j] = temp;
            }
        }
        return c;
    }
}
