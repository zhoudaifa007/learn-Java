package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0134Tests {

    @Test
    public void test1() {
        Leetcode0134 leetcode0134 = new Leetcode0134();
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};

      System.out.println(leetcode0134.canCompleteCircuit(gas, cost));
    }

    @Test
    public void test2() {
        Leetcode0134 leetcode0134 = new Leetcode0134();
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        System.out.println(leetcode0134.canCompleteCircuit(gas, cost));
    }
}
