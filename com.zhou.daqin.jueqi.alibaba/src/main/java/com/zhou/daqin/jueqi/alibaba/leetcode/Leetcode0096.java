package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0096 {
    public int numTrees(int n) {
        int[] array = new int[n + 1];
        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i <= n; i++) {
            for(int j = 0; j <i; j++) {
                array[i] += array[j] * array[ i - j -1];
            }
        }

        return array[n + 1];
    }
}
