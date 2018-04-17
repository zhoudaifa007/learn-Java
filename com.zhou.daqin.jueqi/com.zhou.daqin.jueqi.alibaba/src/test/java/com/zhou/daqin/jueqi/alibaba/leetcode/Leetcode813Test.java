package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

/**
 * Created by Daifa on 2018/4/15.
 */
public class Leetcode813Test {

    @Test
    public void test1(){

        Leetcode813 leetcode813 = new Leetcode813();
        int[] array = {9,1,2,3,9};
        double d = leetcode813.largestSumOfAverages1(array,3);
        System.out.println(d);
    }
}
