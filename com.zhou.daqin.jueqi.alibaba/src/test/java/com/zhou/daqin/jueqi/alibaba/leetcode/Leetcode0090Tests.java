package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.List;

public class Leetcode0090Tests {

    @Test
    public void test1() {
        int[] nums = {1, 2, 2};
        Leetcode0090 leetcode0090 = new Leetcode0090();
        List<List<Integer>> listList = leetcode0090.subsetsWithDup(nums);
        System.out.println(JSON.toJSONString(listList));
    }

    @Test
    public void test2() {
        int[] nums = {1, 2, 2};
        Leetcode0090 leetcode0090 = new Leetcode0090();
        List<List<Integer>> listList = leetcode0090.subsetsWithDup2(nums);
        listList.forEach( t -> System.out.println(JSON.toJSONString(t)));
    }
}
