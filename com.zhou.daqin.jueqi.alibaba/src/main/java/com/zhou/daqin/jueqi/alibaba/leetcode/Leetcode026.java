package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Leetcode026 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }
        Set<Integer> set = map.keySet();
        int index = 0;
        for (Integer e : set) {
            nums[index] = e;
            index++;
        }

        return set.size();
    }
}
