package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Tencent001Tests {

    @Test
    public void test1() {
        int[] arr = {2, 5, 3, 1, 3, 2, 4, 1, 0, 5, 4, 3};
        Tencent001 tencent001 = new Tencent001();
        int a = tencent001.getNum(arr, 5);
        System.out.println(a);
    }
}
