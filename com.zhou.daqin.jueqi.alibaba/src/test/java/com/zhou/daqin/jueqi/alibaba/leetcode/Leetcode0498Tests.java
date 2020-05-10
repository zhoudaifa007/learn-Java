package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class Leetcode0498Tests {

    @Test
    public void test1() {

        int[][] array = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        Leetcode0498 leetcode0498 = new Leetcode0498();
       int[] ans =   leetcode0498.findDiagonalOrder(array);
       System.out.println(JSONObject.toJSONString(ans));

    }
}
