package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode0974 {

    public int subarraysDivByK(int[] A, int K) {

        int[] sum = new int[A.length];
        sum[0] = A[0];

        for(int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + A[i];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i < sum.length; i++) {
            int num = sum[i] % K;
            if(num < 0) {
                num = num + K;
            }
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        int ans = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if(key == 0) {
                ans = ans + value;
            }

            if(value >= 2) {
                ans = ans + (value * (value -1)) /2;
            }
        }

        return ans;
    }
}
