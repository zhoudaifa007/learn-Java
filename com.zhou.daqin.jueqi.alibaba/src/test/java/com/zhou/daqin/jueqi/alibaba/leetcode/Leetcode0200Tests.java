package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0200Tests {

    @Test
    public void test1() {
        Leetcode0200 leetcode0200 = new Leetcode0200();
        char[][] arr = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int count = leetcode0200.numIslands(arr);
        System.out.println(count);
    }
}
