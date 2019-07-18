package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

public class Leetcode1054Test {

    @Test
    public void test1(){
        int[] arr = {1,1,1,1,2,2,3,3};
        Leetcode1054 leetcode1054 = new Leetcode1054();
        int[] a = leetcode1054.rearrangeBarcodes(arr);
        System.out.println(JSON.toJSONString(a));

    }
}
