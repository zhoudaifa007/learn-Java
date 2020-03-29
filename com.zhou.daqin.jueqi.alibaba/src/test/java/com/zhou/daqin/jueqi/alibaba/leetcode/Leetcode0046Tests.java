package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.List;

public class Leetcode0046Tests {

    @Test
    public void test1() {
        int[] num = {1,2,3};
        Leetcode0046 leetcode0046 = new Leetcode0046();
        List<List<Integer>> res = leetcode0046.permute(num);
        System.out.println(JSONObject.toJSON(res));
    }
}
