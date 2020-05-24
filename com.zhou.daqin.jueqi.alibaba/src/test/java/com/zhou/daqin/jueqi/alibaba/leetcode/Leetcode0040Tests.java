package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.List;

public class Leetcode0040Tests {

    @Test
    public void test1() {
        int[] nums =  {2,6,6};
        Leetcode0040 leetcode0040 = new Leetcode0040();
        leetcode0040.combinationSum2(nums,8);
    }

    @Test
    public void test2() {
        int[] nums =  {2,2,2,3};
        Leetcode0040 leetcode0040 = new Leetcode0040();
        List<List<Integer>> ans = leetcode0040.combinationSum2(nums,7);
        System.out.println(JSON.toJSONString(ans));
    }
}
