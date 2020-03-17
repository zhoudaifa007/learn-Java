package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0485Tests {

    @Test
    public void test1() {
        int[] nums ={1,1,0,1,1,1};
        Leetcode0485 leetcode0485 = new Leetcode0485();
        int num = leetcode0485.findMaxConsecutiveOnes(nums);
        System.out.println(num);
    }
}
