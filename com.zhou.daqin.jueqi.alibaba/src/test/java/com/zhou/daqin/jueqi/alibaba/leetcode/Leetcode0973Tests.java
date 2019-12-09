package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0973Tests {


    @Test
    public void test1() {
        int[][] a = {{1,3},{-2,2}};

        Leetcode0973 leetcode973 = new Leetcode0973();
        leetcode973.kClosest(a, 1);
        System.out.println("ok");
    }
}
