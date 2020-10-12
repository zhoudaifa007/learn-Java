package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode1085 {
    public int sumOfDigits(int[] A) {

        int min = Integer.MAX_VALUE;

        for(int a: A) {
            if(a < min) {
                min = a;
            }
        }

        int sum = 0;

        while(min > 0) {
            sum = min % 10;
            min = min / 10;
        }

        if((sum & 1) == 0) {
            return 1;
        }

        return 0;
    }
}
