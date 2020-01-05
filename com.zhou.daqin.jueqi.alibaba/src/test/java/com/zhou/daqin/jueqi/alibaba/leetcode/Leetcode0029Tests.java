package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0029Tests {

    @Test
    public void test1(){
        Leetcode0029 leetcode0029 = new Leetcode0029();
        int dividend =  -2147483648;
        int divisor = -1;
        long res = dividend / divisor;
        int res1 = dividend / divisor;
        leetcode0029.divide(dividend,divisor);

    }

    @Test
    public void test2(){
        Leetcode0029 leetcode0029 = new Leetcode0029();
        int dividend =  -2147483648;
        int divisor = 1;
        long res = dividend / divisor;
        int res1 = dividend / divisor;
        leetcode0029.divide(dividend,divisor);
    }
}
