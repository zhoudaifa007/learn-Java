package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0016Tests {

    @Test
    public void test1() {
        int[] arr = {-1, 2, 1, -4};
        Leetcode0016 leetcode0016 = new Leetcode0016();
        int i = leetcode0016.threeSumClosest(arr,1);
        System.out.println(i);
    }

    @Test
    public void test2() {
        int[] arr = {0,1,2};
        Leetcode0016 leetcode0016 = new Leetcode0016();
        int i = leetcode0016.threeSumClosest(arr,0);
        System.out.println(i);
    }

    @Test
    public void test3() {
        int[] arr = {-3,-2,-5,3,-4};
        Leetcode0016 leetcode0016 = new Leetcode0016();
        int i = leetcode0016.threeSumClosest(arr,-1);
        System.out.println(i);
    }

    @Test
    public void test4() {
        int[] arr = {-1,-5,-3,-4,2,-2};
        Leetcode0016 leetcode0016 = new Leetcode0016();
        int i = leetcode0016.threeSumClosest(arr,0);
        System.out.println(i);
    }
}
