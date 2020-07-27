package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.List;

public class Leetcode0078Tests {

    @Test
    public void test1() {
        int[] arr= {1,2,3};
        Leetcode0078 leetcode0078 = new Leetcode0078();
        List<List<Integer>> res = leetcode0078.subsets(arr);
        System.out.println(JSON.toJSONString(res));
    }
}
