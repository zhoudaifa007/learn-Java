package com.zhou.daqin.jueqi.alibaba.leetcode;

//https://www.youtube.com/watch?v=gsL3T9bI1RQ
public class Leetcode0123 {

    public int maxProfit(int[] prices) {
        int buy1 = Integer.MAX_VALUE, buy2 = Integer.MAX_VALUE;
        int sell1 = 0, sell2 = 0;

        for (int i = 0; i < prices.length; i++) {
            buy1 = Math.min(buy1, prices[i]);
            sell1 = Math.max(sell1, prices[i] - buy1);
            buy2 = Math.min(buy2, prices[i] - sell1);
            sell2 = Math.max(sell2, prices[i] - buy2);
        }

        return sell2;
    }

    public int maxProfit1(int[] prices) {
        int hold1 = Integer.MIN_VALUE, hold2 = Integer.MIN_VALUE;
        int release1 = 0, release2 = 0;
        for(int i:prices){                              // Assume we only have 0 money at first
            release2 = Math.max(release2, hold2+i);     // The maximum if we've just sold 2nd stock so far.
            hold2    = Math.max(hold2,    release1-i);  // The maximum if we've just buy  2nd stock so far.
            release1 = Math.max(release1, hold1+i);     // The maximum if we've just sold 1nd stock so far.
            hold1    = Math.max(hold1,    -i);          // The maximum if we've just buy  1st stock so far.
        }
        return release2; ///Since release1 is initiated as 0, so release2 will always higher than release1.
    }

    public int maxProfit3(int[] prices) {
        int length = prices.length;
        int[] hold1 = new int[length + 1];
        int[] sold1 = new int[length + 1];
        int[] hold2 = new int[length + 1];
        int[] sold2 = new int[length + 1];
        hold1[0] = Integer.MIN_VALUE;
        hold2[0] = Integer.MIN_VALUE;
        for(int i = 0; i < length; i++){                              // Assume we only have 0 money at first
            sold2[i + 1] = Math.max(sold2[i], hold2[i] + prices[i]);     // The maximum if we've just sold 2nd stock so far.
            hold2[i + 1] = Math.max(hold2[i], sold1[i] - prices[i]);  // The maximum if we've just buy  2nd stock so far.
            sold1[i + 1] = Math.max(sold1[i], hold1[i] + prices[i]);     // The maximum if we've just sold 1nd stock so far.
            hold1[i + 1] = Math.max(hold1[i], 0 - prices[i]);          // The maximum if we've just buy  1st stock so far.
        }
        return sold2[length]; ///Since release1 is initiated as 0, so release2 will always higher than release1.
    }
}
