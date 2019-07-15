package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Daifa on 2018/4/14.
 */
public class LongIncreSubStringTest {

    @Test
    public void test1(){
        int[] array = {10,22,9,33,21,50,41,60,80};
        int[] dp = new int[array.length];
        int len = LongIncreSubString.LongestSubString(array,dp);
        System.out.println(len);
        LongIncreSubString.generateLIS(array,dp);
    }

}
