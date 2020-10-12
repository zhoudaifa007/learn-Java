package com.zhou.daqin.jueqi.alibaba.leetcode;


import java.util.Set;
import java.util.TreeSet;

public class Leetcode0198 {

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0]  = nums[0];
        if(dp.length >= 2) {
            dp[1] = Math.max(nums[0], nums[1]);
        }
        Set<Integer> set = new TreeSet<>();
        for(int i = 2; i < dp.length; i++) {
            if(dp[i-1] >= dp[i -2] + nums[i]) {
                dp[i] = dp[i-1];
            } else {
                dp[i] = dp[i -2] + nums[i];
                set.add(i - 2);
                set.add(i);
            }
        }
//        for (Integer s: set)
//            System.out.println(s);

        return dp[dp.length - 1];
    }

    public int rob2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] r = new int[nums.length];
        r[0]  = nums[0];
        int[] nr  = new int[nums.length];
        nr[0] = 0;

        for(int i = 1; i < nums.length; i++) {
            r[i] = nr[i - 1]  + nums[i];
            nr[i] = Math.max(r[i - 1], nr[i - 1]);
        }

        return Math.max(r[nums.length - 1], nr[nums.length - 1]);
    }
}
