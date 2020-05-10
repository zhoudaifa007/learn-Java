package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0064Tests {

    @Test
    public void test1() {
        int[][] array = {
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        Leetcode0064 leetcode0064 = new Leetcode0064();
        leetcode0064.minPathSum(array);
        System.out.println("ok");
    }
}
