package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

/**
 * Created by Daifa on 2018/4/15.
 */
public class Leetcode0813Test {

    @Test
    public void test1(){

        Leetcode0813 leetcode0813 = new Leetcode0813();
        int[] array = {9,1,2,3,9};
        double d = leetcode0813.largestSumOfAverages1(array,3);
        System.out.println(d);
    }
}
