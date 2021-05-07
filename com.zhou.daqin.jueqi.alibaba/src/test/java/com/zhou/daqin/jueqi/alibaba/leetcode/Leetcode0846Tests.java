package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0846Tests {
    @Test
    public void test1() {
        int[] a = {1,2,3,6,2,3,4,7,8};

        Leetcode0846 leetcode0846 = new Leetcode0846();
        leetcode0846.isNStraightHand(a, 3);
    }

    @Test
    public void test2() {
        int n = 5;
        for( int i = 1; i <=36 ;i ++) {

            int row = n - (i - 1) / n - 1;

            int col = ((n - row) % 2 != 0) ? (i - 1) % n : n - (i - 1) % n - 1;
            System.out.printf("%d\t",col);
        }
        System.out.println();

        for( int i = 1; i <=36 ;i ++) {

            int row = n - (i - 1) / n - 1;

            int col = (row % 2 != 0) ? (i - 1) % n : n - (i - 1) % n - 1;
            System.out.printf("%d\t",col);
        }
    }
}
