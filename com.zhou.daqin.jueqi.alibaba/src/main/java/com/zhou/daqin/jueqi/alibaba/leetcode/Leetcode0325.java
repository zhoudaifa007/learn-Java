package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode0325 {

    public int maxSubArrayLen(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int result = 0, sum = 0;
        hm.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (hm.containsKey(sum - k)) {
                result = Math.max(i - (hm.get(sum - k) + 1) + 1, result);
            }
            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
        }
        return result;
    }
}
