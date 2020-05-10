package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0983 {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[366];
        int[] travel = new int[366];

        dp[0] = 0;
        for(int day: days) {
            travel[day] = 1;
        }

        for(int i = 1; i < dp.length; i++) {
            if( i > days[days.length - 1]) {
                break;
            }
            if(travel[i] == 0) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + costs[0];
                dp[i] = Math.min(dp[i] , dp[Math.max(i - 7,0)] + costs[1]);
                dp[i] = Math.min(dp[i] , dp[Math.max(i - 30,0)] + costs[2]);
            }
        }
        return dp[days[days.length - 1]];
    }
}
