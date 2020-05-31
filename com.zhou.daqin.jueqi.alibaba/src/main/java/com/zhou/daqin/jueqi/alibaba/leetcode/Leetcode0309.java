package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0309 {
    int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        int[] s0 = new int[prices.length];
        int[] s1 = new int[prices.length];
        int[] s2 = new int[prices.length];

        //s1表示刚持仓
        s1[0] = -prices[0];
        //s1表示冷却
        s0[0] = 0;
        //s2表示刚卖出
        s2[0] = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            s0[i] = Math.max(s0[i - 1], s2[i - 1]);
            s1[i] = Math.max(s1[i - 1], s0[i - 1] - prices[i]);
            s2[i] = s1[i - 1] + prices[i];
        }
        return Math.max(s0[prices.length - 1], s2[prices.length - 1]);
    }

    int maxProfit1(int[] prices) {
        //表示当天持有股票
        int hold = Integer.MIN_VALUE;
        //表示当天空仓，但是还在CD
        int sold = 0;
        //表示当天空仓，CD完成
        int cooled = 0;

        for(int i = 0; i < prices.length; i++) {
            int hold2 = hold;
            int sold2 = sold;
            int cooled2 = cooled;
            hold =  Math.max(hold2,cooled2 - prices[i]);
            sold = hold2 + prices[i];
            cooled = Math.max(cooled2, sold2);
        }

        return Math.max(sold, cooled);
    }
}
