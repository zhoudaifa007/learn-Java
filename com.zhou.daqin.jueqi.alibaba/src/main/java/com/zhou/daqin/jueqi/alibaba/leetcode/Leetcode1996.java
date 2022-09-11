package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.Arrays;

public class Leetcode1996 {
    public int numberOfWeakCharacters(int[][] properties) {
        // sorting
        int n = properties.length;
        int count = 0;

        Arrays.sort(properties, (a, b) -> (b[0] == a[0]) ? (a[1] - b[1]) : b[0] - a[0]);

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, properties[i][1]);
            if (properties[i][1] < max) {
                count++;
            }

        }
        return count;
    }
}
