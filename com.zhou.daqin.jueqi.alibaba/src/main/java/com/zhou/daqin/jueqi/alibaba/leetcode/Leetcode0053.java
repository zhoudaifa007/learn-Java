package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0053 {

    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int maxToCurr = nums[0];

        ans = Math.max( ans,maxToCurr);
        for(int i = 1 ; i < nums.length; i++) {
            maxToCurr = Math.max(nums[i], maxToCurr + nums[i]);
            ans = Math.max( ans,maxToCurr);
        }
        return ans;
    }
}
