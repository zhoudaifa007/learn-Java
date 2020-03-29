package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0377Tests {

    @Test
    public void test1() {
        int[] array = {1, 2, 3};
        Leetcode0377 leetcode0377 = new Leetcode0377();
        int res = leetcode0377.combinationSum4(array, 4);
        System.out.println(res);
    }

    @Test
    public void test2() {
        int[] array = {1, 2, 3};
        Leetcode0377 leetcode0377 = new Leetcode0377();
        int res = leetcode0377.combinationSum4DP(array, 4);
        System.out.println(res);
    }

    @Test
    public void test3() {
        int[] array = {1, 2, 3};
        Leetcode0377 leetcode0377 = new Leetcode0377();
        int res = leetcode0377.combinationSum4GetList(array, 4);
        System.out.println(res);
    }

    @Test
    public void test4() {
        int[] array = {4, 2, 1};
        Leetcode0377 leetcode0377 = new Leetcode0377();
        int res = leetcode0377.combinationSum4GetList(array, 15);
        System.out.println(res);
    }

    @Test
    public void test5() {
        int[] array = {4, 2, 1};
        Leetcode0377 leetcode0377 = new Leetcode0377();
        int res = leetcode0377.combinationSum4(array, 15);
        System.out.println(res);
    }


}
