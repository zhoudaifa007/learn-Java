package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0240Tests {

    @Test
    public void test1() {
        int[][] array = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        Leetcode0240 leetcode0240 = new Leetcode0240();
        boolean flag =  leetcode0240.searchMatrix(array,20);
        System.out.println(flag);
    }
}
