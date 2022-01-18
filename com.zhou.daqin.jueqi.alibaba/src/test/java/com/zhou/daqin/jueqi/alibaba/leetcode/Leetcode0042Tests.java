package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0042Tests {

    @Test
    public void test1() {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Leetcode0042 leetcode0042 = new Leetcode0042();
        int res =  leetcode0042.trap2(arr);
        System.out.println("ok");
        System.out.println(res);
    }
}
