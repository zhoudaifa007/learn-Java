package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class Leetcode0034Tests {

    @Test
    public void test1() {
        int[] array = {5,7,7,8,8,10};
        Leetcode0034 leetcode0034 = new Leetcode0034();
        int[] arr = leetcode0034.searchRange(array,8);
        System.out.println(JSONObject.toJSONString(arr));
    }

    @Test
    public void test2() {
        int[] array = {5,7,7,8,8,10};
        Leetcode0034 leetcode0034 = new Leetcode0034();
        int[] arr = leetcode0034.searchRange(array,6);
        System.out.println(JSONObject.toJSONString(arr));
    }

    @Test
    public void test3() {
        int[] array = {1};
        Leetcode0034 leetcode0034 = new Leetcode0034();
        int[] arr = leetcode0034.searchRange(array,1);
        System.out.println(JSONObject.toJSONString(arr));
    }

    @Test
    public void test4() {
        int[] array = {1,4};
        Leetcode0034 leetcode0034 = new Leetcode0034();
        int[] arr = leetcode0034.searchRange(array,4);
        System.out.println(JSONObject.toJSONString(arr));
    }
}
