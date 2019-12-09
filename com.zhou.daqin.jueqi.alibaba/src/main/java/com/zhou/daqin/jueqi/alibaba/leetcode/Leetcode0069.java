package com.zhou.daqin.jueqi.alibaba.leetcode;

/**
 * Created by Daifa on 2018/4/14.
 */
public class Leetcode0069 {

    public static int sqrt(int x) {
        int big = x;
        int small = 0;

        while((small * small) <= x) {
            int temp = (big + small)/2;
            if(temp * temp > x) {
                big = temp -1;
            } else if(temp * temp < x) {
                small = temp + 1;
            } else {
                return temp;
            }
        }
        return small - 1;
    }

    public static int sqrt1(int x) {
        int big = x;
        int small = 1;
        if(x == 0) {
            return 0;
        }

        while(true) {
            int temp = (big + small )/2 ;
            if(temp > x /temp) {
                big = temp -1;
            } else  {
                if(temp + 1 > x / (temp + 1))  {
                    return temp;
                }
                small = temp + 1;
            }
        }
    }
}
