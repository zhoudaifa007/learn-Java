package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0207Tests {

    @Test
    public void test1() {
        Leetcode0207 leetcode0207 = new Leetcode0207();
        int[][] array = {
                {1,0},
                {2,1},
                {0,2},
        };
        boolean flag = leetcode0207.canFinish(4, array);
        System.out.println(flag);
    }

    @Test
    public void test2() {
        Leetcode0207 leetcode0207 = new Leetcode0207();
        int[][] array = {
                {0,1},
                {0,2},
                {1,2},
        };
        boolean flag = leetcode0207.canFinish(3, array);
        System.out.println(flag);
    }
}
