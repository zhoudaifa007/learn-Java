package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0547Tests {

    @Test
    public void test1() {
        int[][] array = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        Leetcode0547 leetcode0547 = new Leetcode0547();
       int count = leetcode0547.findCircleNum(array);
       System.out.println(count);
    }
}
