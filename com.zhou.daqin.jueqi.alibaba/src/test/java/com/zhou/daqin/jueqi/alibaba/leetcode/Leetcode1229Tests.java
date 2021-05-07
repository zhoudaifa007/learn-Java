package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

import java.util.List;

public class Leetcode1229Tests {

    @Test
    public void test1() {
        int[][] slots1 = {{10,50},{60,120},{140,210}};
        int[][] slots2 = {{0,15},{60,70}};
        int d = 8;
        Leetcode1229 leetcode1229 = new Leetcode1229();
        List<Integer> res = leetcode1229.minAvailableDuration(slots1, slots2, d);
        System.out.println("ok");
    }
}
