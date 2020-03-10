package com.zhou.daqin.jueqi.alibaba.leetcode.dynamicprogram;

import org.junit.Test;

public class Leetcode0213Tests {

    @Test
    public void test1(){
        int[] array = {2,3,2};
        Leetcode0213 leetcode0213 = new Leetcode0213();
        leetcode0213.rob(array);
    }

    @Test
    public void test2(){
        int[] array = {1,1,1,2};
        Leetcode0213 leetcode0213 = new Leetcode0213();
        leetcode0213.rob(array);
    }

    @Test
    public void test3(){
        int[] array = {2,2,4,3,2,5};
        Leetcode0213 leetcode0213 = new Leetcode0213();
        System.out.println(leetcode0213.rob(array));
    }
}
