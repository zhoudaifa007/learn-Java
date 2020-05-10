package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0121 {
    public int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }


    public int maxProfitByDp(int[] prices) {
        int[][] T = new int[prices.length][2];

        if(prices == null || prices.length<= 1) {
            return 0;
        }

        T[0][0] = 0;
        T[0][1] = -prices[0];

        for(int i = 1; i < prices.length; i++) {
            for(int j = 0; j <= 1; j++) {
                T[i][0] = Math.max(T[i-1][0], T[i-1][1] + prices[i]);
                T[i][1] = Math.max(T[i-1][1], - prices[i]);
            }
        }
        return T[prices.length - 1][0];
    }
}
