package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.List;

public class Leetcode0018Tests {

    @Test
    public void test1() {
        int[] arr = {1, 0, -1, 0, -2, 2};
        Leetcode0018 leetcode018 = new Leetcode0018();
        List<List<Integer>> list = leetcode018.fourSum(arr,0);
        System.out.println(JSONObject.toJSONString(list));
    }
}
