package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0188 {

    //dp[i][j] = maximum profit from at most i transactions using prices[0..j]
    //tmpMax =  maximum profit of just doing at most i-1 transactions, using at most first j-1 prices, and buying the stock at price[j]

    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        if (k >= len / 2) return quickSolve(prices);

        int[][] t = new int[k + 1][len];
        for (int i = 1; i <= k; i++) {
            int tmpMax =  -prices[0];
            for (int j = 1; j < len; j++) {
                t[i][j] = Math.max(t[i][j - 1], prices[j] + tmpMax);
                tmpMax =  Math.max(tmpMax, t[i - 1][j - 1] - prices[j]);
            }
        }
        return t[k][len - 1];
    }


    private int quickSolve(int[] prices) {
        int len = prices.length, profit = 0;
        for (int i = 1; i < len; i++)
            // as long as there is a price gap, we gain a profit.
            if (prices[i] > prices[i - 1]) profit += prices[i] - prices[i - 1];
        return profit;
    }
}
