package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0560Tests {

    @Test
    public void test1() {
        int[] arrar = {1,1,1};
        Leetcode0560 leetcode0560 = new Leetcode0560();
        int k =  leetcode0560.subarraySum(arrar,2);
        System.out.println(k);
    }
}
