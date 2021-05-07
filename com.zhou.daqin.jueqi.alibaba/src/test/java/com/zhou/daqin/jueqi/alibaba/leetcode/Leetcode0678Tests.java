package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0678Tests {

    @Test
    public void test1() {
        String s = "()";

        Leetcode0678 leetcode0678 = new Leetcode0678();
        boolean  f = leetcode0678.checkValidString(s);
        System.out.println(f);

    }

    @Test
    public void test2() {
        String s = "**))((*)";

        Leetcode0678 leetcode0678 = new Leetcode0678();
        boolean  f = leetcode0678.checkValidString(s);
        System.out.println(f);

    }

}
