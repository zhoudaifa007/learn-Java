package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode1003Tests {

    @Test
    public void test1() {
        Leetcode1003 leetcode1003 = new Leetcode1003();
        boolean b = leetcode1003.isValid("aabcbc");
        System.out.println(b);
    }

    @Test
    public void test2() {
        Leetcode1003 leetcode1003 = new Leetcode1003();
        boolean b = leetcode1003.isValid("abcabcababcc");
        System.out.println(b);
    }

    @Test
    public void test3() {
        Leetcode1003 leetcode1003 = new Leetcode1003();
        boolean b = leetcode1003.isValid("abccba");
        System.out.println(b);
    }

    @Test
    public void test4() {
        Leetcode1003 leetcode1003 = new Leetcode1003();
        boolean b = leetcode1003.isValid("aabcbc");
        System.out.println(b);
    }
}
