package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode1954 {


    public long minimumPerimeter(long neededApples) {
        long r = 0;
        long total = 0;
        while (total < neededApples) {
            r++;
            total += 12 * r * r;
        }
        return r * 8;
    }
}
