package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0746 {

    public int minCostClimbingStairs(int[] cost) {
        //第i个台阶的最小费用
        int[] dp = new int[cost.length + 2];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 0;
        for(int i = 3; i <= dp.length - 1; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 2], dp[i -2] + cost[i- 2 - 1]);
        }
        return dp[dp.length - 1];
    }
}
