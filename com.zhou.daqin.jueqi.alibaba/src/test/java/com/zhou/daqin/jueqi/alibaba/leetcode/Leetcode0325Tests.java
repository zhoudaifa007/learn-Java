package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0325Tests {

    @Test
    public void test1() {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 1;
        Leetcode0325 leetcode0325 = new Leetcode0325();
        int res = leetcode0325.maxSubArrayLen(arr, k);
        System.out.println(res);
        System.out.println("ok");
    }
}
