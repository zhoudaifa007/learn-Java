package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.*;

public class Leetcode0823 {

    public int numFactoredBinaryTrees(int[] A) {
        Arrays.sort(A);
        Map<Integer, Long> map = new HashMap();
        long count = 1;
        map.put(A[0], count);
        for (int i = 1; i < A.length; i++) {
            count = 1;
            for (Integer n : map.keySet()) {
                if(n > A[i]) {
                    break;
                }
                if (A[i] % n == 0 && map.containsKey(A[i] / n)) {
                    count += map.get(n) * map.get(A[i] / n);
                }
            }
            map.put(A[i], count);
        }
        long sum = 0;
        for (Integer n : map.keySet()) {
            sum = (sum + map.get(n)) % ((int) Math.pow(10, 9) + 7);
        }
        return (int) sum;
    }
}