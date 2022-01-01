package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode1249Tests {

    @Test
    public void test1() {
        Leetcode1249 leetcode1249 = new Leetcode1249();
        String s =  leetcode1249.minRemoveToMakeValid("()(((())())");
        System.out.println(s.length());
    }
}
