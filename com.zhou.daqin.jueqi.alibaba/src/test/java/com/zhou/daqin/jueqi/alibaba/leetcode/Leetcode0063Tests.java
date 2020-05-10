package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0063Tests {

    @Test
    public void test1() {
        Leetcode0063 leetcode0063 = new Leetcode0063();
        int[][] array = {
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
       int n =  leetcode0063.uniquePathsWithObstacles(array);
       System.out.println(n);
    }
}
