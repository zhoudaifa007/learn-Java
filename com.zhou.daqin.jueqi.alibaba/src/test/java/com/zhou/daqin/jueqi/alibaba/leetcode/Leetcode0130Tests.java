package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0130Tests {

    @Test
    public void test1() {
        char[][] b = {{'O','X','X','O','X'},{'X','O','O','X','O'},{'X','O','X','O','X'},{'O','X','O','O','O'},{'X','X','O','X','O'}};
        Leetcode0130 leetcode0130 = new Leetcode0130();
        leetcode0130.solve(b);
        System.out.println("ok");
    }
}
