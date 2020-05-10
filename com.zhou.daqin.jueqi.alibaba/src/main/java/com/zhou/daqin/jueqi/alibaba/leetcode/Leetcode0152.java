package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0152 {

    public int maxProduct(int[] nums) {
        int curMax = nums[0];
        int curMin = nums[0];
        int max = nums[0];

        for(int i = 1; i< nums.length; i++) {
            int nextMax = curMax * nums[i];
            int nextMin = curMin * nums[i];
            curMax = Math.max(nums[i], Math.max(nextMax, nextMin));
            curMin = Math.min(nums[i], Math.min(nextMax, nextMin));
            max = Math.max(max, curMax);
        }

        return max;
    }
}
