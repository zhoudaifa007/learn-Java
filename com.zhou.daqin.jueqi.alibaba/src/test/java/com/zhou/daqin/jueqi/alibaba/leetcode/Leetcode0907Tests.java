package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0907Tests {

    @Test
    public void test1() {
        Leetcode0907 leetcode0907 = new Leetcode0907();
        int[] arr = {3,1,2,4};
        int sum =  leetcode0907.sumSubarrayMins2(arr);
        System.out.println(sum);
    }

    @Test
    public void test2() {
        Leetcode0907 leetcode0907 = new Leetcode0907();
        int[] arr = {11,81,94,43,3};
        int sum =  leetcode0907.sumSubarrayMins(arr);
        System.out.println(sum);
    }
}
