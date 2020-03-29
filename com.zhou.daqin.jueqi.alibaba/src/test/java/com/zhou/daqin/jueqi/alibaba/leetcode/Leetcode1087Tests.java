package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode1087Tests {

    @Test
    public void test1() {
        String s = "{a,b}c{d,e}f";
        Leetcode1087 leetcode1087 = new Leetcode1087();
        leetcode1087.expand(s);
    }

    @Test
    public void test2() {
        String s = "{a,b}{z,x,y}";
        Leetcode1087 leetcode1087 = new Leetcode1087();
        leetcode1087.expand(s);
    }
}
