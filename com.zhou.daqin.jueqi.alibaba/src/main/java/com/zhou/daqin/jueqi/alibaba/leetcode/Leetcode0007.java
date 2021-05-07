package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0007 {

    public int reverse(int x) {

        int mul = 1;
        if(x < 0) {
            mul = -1;
        }
        x = Math.abs(x);


        long num1  = 0;
        while(x > 0) {
            int temp = x % 10;
            x = x / 10;
            num1 = num1 * 10 + temp;
            if(num1 > Integer.MAX_VALUE) {
                return 0;
            }
        }

        return (int)num1 * mul;
    }
}
