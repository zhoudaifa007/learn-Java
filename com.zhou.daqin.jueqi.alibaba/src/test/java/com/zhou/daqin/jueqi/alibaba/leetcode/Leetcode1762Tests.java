package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

public class Leetcode1762Tests {

    @Test
    public void test1() {
        Leetcode1762 leetcode1762 = new Leetcode1762();

        int[] a = {4,2,3,1};
        int[] buildings = leetcode1762.findBuildings(a);
        System.out.println(JSON.toJSON(buildings));
    }
}
