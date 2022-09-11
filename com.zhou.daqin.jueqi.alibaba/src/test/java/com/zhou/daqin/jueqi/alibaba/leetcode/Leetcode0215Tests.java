package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0215Tests {

    @Test
    public void test1() {
        int[] a = {3,2,1,5,6,4};
        Leetcode0215 leetcode0215 = new Leetcode0215();
        int s = leetcode0215.findKthLargest(a, 2);
        System.out.println(s);

    }
}
