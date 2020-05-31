package com.zhou.daqin.jueqi.alibaba.leetcode;

//这道题注意越界的问题
public class Leetcode0714 {

    public int maxProfit(int[] prices, int fee) {
        int hold = Integer.MIN_VALUE / 2;
        int sold = 0;

        for(int i = 0; i < prices.length; i++) {
            int hold2 = hold;
            int sold2 = sold;
            hold = Math.max(hold2, sold2 - prices[i]);
            sold = Math.max(sold2, hold2 + prices[i] - fee);
        }
        return sold;
    }
}
