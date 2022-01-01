package com.zhou.daqin.jueqi.alibaba.contest;

public class Leetcode5958 {

    public long getDescentPeriods(int[] prices) {
        if(prices.length == 1) {
            return 1;
        }

        long res = 0;
        int index = 1;
        int count = 1;
        while (index < prices.length) {

            if(prices[index] - prices[index -1] == -1) {
                count = count + 1;
            } else {
                res = res + count * (count + 1) / 2;
                count = 1;
            }


            index = index + 1;
        }

        res = res + count * (count + 1) / 2;


        return res;
    }

}
