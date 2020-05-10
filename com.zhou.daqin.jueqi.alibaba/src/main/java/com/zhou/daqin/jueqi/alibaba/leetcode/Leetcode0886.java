package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0886 {
    public boolean possibleBipartition(int N, int[][] dislikes) {

        int[] visited = new int[N +1];
        for(int k = 0 ; k < dislikes.length; k++) {
            int[] array = dislikes[k];
            for   (int i = 0 ; i < array.length; i++)
                for (int j = i + 1; j < array.length;j++) {

                }
        }

        return false;
    }


}
