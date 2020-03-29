package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0394Tests {

    @Test
    public void test1() {
        Leetcode0394 leetcode0394  = new Leetcode0394();
        System.out.println(leetcode0394.decodeString("3[a]2[bc]"));
    }

    @Test
    public void test2() {
        Leetcode0394 leetcode0394  = new Leetcode0394();
        System.out.println(leetcode0394.decodeString("3[a2[c]]"));
    }

    @Test
    public void test3() {
        Leetcode0394 leetcode0394  = new Leetcode0394();
        System.out.println(leetcode0394.decodeString("2[abc]3[cd]e"));
    }

    @Test
    public void test4() {
        Leetcode0394 leetcode0394  = new Leetcode0394();
        System.out.println(leetcode0394.decodeString("10[abc]"));
    }

    @Test
    public void test5() {
        Leetcode0394 leetcode0394  = new Leetcode0394();
        System.out.println(leetcode0394.decodeString("3[a]2[b4[F]c]"));
    }
}
