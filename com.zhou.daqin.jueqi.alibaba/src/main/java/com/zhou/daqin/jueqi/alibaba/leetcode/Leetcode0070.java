package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0070 {

    public int climbStairs(int n) {
        int lengh = n + 2;
        int[] dp = new int[lengh];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i -2];
        }
        return dp[n];
    }
}
