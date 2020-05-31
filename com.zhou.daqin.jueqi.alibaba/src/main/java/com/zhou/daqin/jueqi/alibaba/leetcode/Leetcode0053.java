package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0053 {

    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        //maxToCurr的定义，以i - 1元素结尾的最大值
        int maxToCurr = nums[0];

        ans = Math.max( ans,maxToCurr);
        for(int i = 1 ; i < nums.length; i++) {
            maxToCurr = Math.max(nums[i], maxToCurr + nums[i]);
            ans = Math.max( ans,maxToCurr);
        }
        return ans;
    }

    public int maxSubArray1(int[] nums) {
        int ans = Integer.MIN_VALUE;
        //maxToCurr的定义，以i - 1元素结尾的最大值
        int maxToCurr = nums[0];

        ans = Math.max( ans,maxToCurr);
        for(int i = 1 ; i < nums.length; i++) {
            if (maxToCurr <=0) {
                maxToCurr = nums[i];
            } else {
                maxToCurr =  maxToCurr + nums[i];
            }
            ans = Math.max( ans,maxToCurr);
        }
        return ans;
    }
}
