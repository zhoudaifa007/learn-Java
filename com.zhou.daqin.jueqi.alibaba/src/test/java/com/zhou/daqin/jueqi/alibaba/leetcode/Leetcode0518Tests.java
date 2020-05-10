package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0518Tests {

    @Test
    public void test1() {
        Leetcode0518 leetcode0518 = new Leetcode0518();
        int[] array = {1,2,5};
        leetcode0518.coinrep(array, 12);
    }

    @Test
    public void test2() {
        Leetcode0518 leetcode0518 = new Leetcode0518();
        int[] array = {1,1,2,5};
        leetcode0518.coinnonrep(array, 12);
    }
}
