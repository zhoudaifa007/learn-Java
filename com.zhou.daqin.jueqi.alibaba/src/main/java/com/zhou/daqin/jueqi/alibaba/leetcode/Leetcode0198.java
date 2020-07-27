package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.Collections;
import java.util.HashSet;
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
}
