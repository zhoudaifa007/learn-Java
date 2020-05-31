package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0123Tests {

    @Test
    public void test1() {
        int[] prices = {5, 3, 8, 18, 11, 12, 15};

        Leetcode0123 leetcode0123 = new Leetcode0123();
        int max = leetcode0123.maxProfit(prices);
        System.out.println(max);
    }




    @Test
    public void test2() {
        int[] prices = {5, 3, 8, 18, 11, 12, 15};

        Leetcode0123 leetcode0123 = new Leetcode0123();
        int max = leetcode0123.maxProfit1(prices);
        System.out.println(max);
    }

    @Test
    public void test3() {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};

        Leetcode0123 leetcode0123 = new Leetcode0123();
        int max = leetcode0123.maxProfit1(prices);
        System.out.println(max);
    }

    @Test
    public void test4() {
        int[] prices = {5, 3, 8, 18, 11, 12, 15};

        Leetcode0123 leetcode0123 = new Leetcode0123();
        int max = leetcode0123.maxProfit3(prices);
        System.out.println(max);
    }

    @Test
    public void test5() {
        int[] prices = {1,2,3,4,5};
        Leetcode0123 leetcode0123 = new Leetcode0123();
        int max = leetcode0123.maxProfit3(prices);
        System.out.println(max);
    }
}
