package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode016Tests {

    @Test
    public void test1() {
        int[] arr = {-1, 2, 1, -4};
        Leetcode016 leetcode016 = new Leetcode016();
        int i = leetcode016.threeSumClosest(arr,1);
        System.out.println(i);
    }

    @Test
    public void test2() {
        int[] arr = {0,1,2};
        Leetcode016 leetcode016 = new Leetcode016();
        int i = leetcode016.threeSumClosest(arr,0);
        System.out.println(i);
    }

    @Test
    public void test3() {
        int[] arr = {-3,-2,-5,3,-4};
        Leetcode016 leetcode016 = new Leetcode016();
        int i = leetcode016.threeSumClosest(arr,-1);
        System.out.println(i);
    }

    @Test
    public void test4() {
        int[] arr = {-1,-5,-3,-4,2,-2};
        Leetcode016 leetcode016 = new Leetcode016();
        int i = leetcode016.threeSumClosest(arr,0);
        System.out.println(i);
    }
}
