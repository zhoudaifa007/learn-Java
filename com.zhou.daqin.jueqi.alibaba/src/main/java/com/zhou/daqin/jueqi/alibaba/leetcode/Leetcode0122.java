package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0122 {

    public int maxProfit(int[] prices) {

        if(prices == null || prices.length <= 1) {
            return 0;
        }
        int[] array = new int[prices.length];

        for(int i = 1 ; i < prices.length; i++) {
            array[i] = prices[i] - prices[i -1];
        }

        int max = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] >0) {
                max += array[i];
            }
        }
        return max;
    }
}
