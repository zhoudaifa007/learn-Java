package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0233 {

    public int countDigitOne(int n) {

        if(n < 0) {
            return 0;
        }

        String str = String.valueOf(n);
        int len = str.length();

        int count = 0;
        for(int i = 1; i <= len; i++) {
            int pre =  n / ((int)Math.pow(10,i));
            int post = n % ((int)Math.pow(10,i - 1));
            char c = str.charAt(len - i);
            int me = c - '0';

            count += pre * ((int)Math.pow(10, i - 1));

            if(me > 1) {
                count += (int)Math.pow(10, i - 1);
            }
            if(me == 1) {
                count += post + 1;
            }

        }
        return count;
    }
}
