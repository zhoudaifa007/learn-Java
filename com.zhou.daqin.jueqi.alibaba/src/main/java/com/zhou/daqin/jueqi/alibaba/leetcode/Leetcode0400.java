package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0400 {

    /**
     * 1-9, 1 * 9 ， 1
     * 10-99 ， 2 * 90， 10，
     * 100-999， 3 * 900， 100
     *
     * @param n
     * @return
     */
    public int findNthDigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;

        while (n > len * count) {
            n -= len * count;
            len += 1;
            count *= 10;
            start *= 10;
        }

        start += (n - 1) / len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n - 1) % len));
    }
}
