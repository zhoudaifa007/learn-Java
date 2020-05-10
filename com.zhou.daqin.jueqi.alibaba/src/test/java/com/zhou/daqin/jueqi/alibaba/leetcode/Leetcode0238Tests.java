package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class Leetcode0238Tests {

    @Test
    public void test1() {
        int[] arr = {1,2,3,4};
        Leetcode0238 leetcode0238 = new Leetcode0238();
        int[] ans = leetcode0238.productExceptSelf(arr);
        System.out.println(JSONObject.toJSONString(ans));
    }
}
