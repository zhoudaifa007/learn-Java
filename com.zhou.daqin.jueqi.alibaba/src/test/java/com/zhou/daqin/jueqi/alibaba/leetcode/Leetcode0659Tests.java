package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0659Tests {

    @Test
    public void test1() {
        int[] array = {1,2,3,3,4,5};
        Leetcode0659 leetcode0659 = new Leetcode0659();
        boolean flag =  leetcode0659.isPossible(array);
        System.out.println(flag);
    }

    @Test
    public void test2() {
        int[] array = {1,2,3,3,4,4,5,5};
        Leetcode0659 leetcode0659 = new Leetcode0659();
        boolean flag =  leetcode0659.isPossible(array);
        System.out.println(flag);
    }

    @Test
    public void test3() {
        int[] array = {1,2,3,4,4,5};
        Leetcode0659 leetcode0659 = new Leetcode0659();
        boolean flag =  leetcode0659.isPossible(array);
        System.out.println(flag);
    }

    @Test
    public void test4() {
        int[] array = {1,1,1,2,2,2,3,3,3};
        Leetcode0659 leetcode0659 = new Leetcode0659();
        boolean flag =  leetcode0659.isPossible(array);
        System.out.println(flag);
    }
}
