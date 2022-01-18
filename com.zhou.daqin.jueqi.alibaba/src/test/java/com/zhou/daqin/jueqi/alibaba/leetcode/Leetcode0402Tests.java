package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0402Tests {

    @Test
    public void test1() {
        Leetcode0402 leetcode0402 = new Leetcode0402();
        String s = leetcode0402.removeKdigits("1432219", 3);
        System.out.println(s);
    }

    @Test
    public void test2() {
        Leetcode0402 leetcode0402 = new Leetcode0402();
        String s = leetcode0402.removeKdigits("10200", 1);
        System.out.println(s);
    }
}
