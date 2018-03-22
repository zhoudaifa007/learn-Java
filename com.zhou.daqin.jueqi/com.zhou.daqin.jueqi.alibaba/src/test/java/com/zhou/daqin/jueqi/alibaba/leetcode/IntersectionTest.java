package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * Created by zhoudf2 on 2017-7-9.
 */

public class IntersectionTest {

    @Test
    public void test1()
    {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        Intersection in = new Intersection();
        int[] array =  in.intersection(arr1,arr2);
        System.out.println(JSONObject.toJSONString(array));
    }

    @Test
    public void test2()
    {
        int[] arr1 = {};
        int[] arr2 = {};
        Intersection in = new Intersection();
        int[] array =  in.intersection(arr1,arr2);
        System.out.println(JSONObject.toJSONString(array));
    }

    @Test
    public void test3()
    {
        int[] arr1 = {2, 1};
        int[] arr2 = {1, 1};
        Intersection in = new Intersection();
        int[] array =  in.intersection(arr1,arr2);
        System.out.println(JSONObject.toJSONString(array));
    }

    @Test
    public void test4()
    {
        int[] arr1 = {4,7,9,7,6,7};
        int[] arr2 = {5,0,0,6,1,6,2,2,4};
        Intersection in = new Intersection();
        int[] array =  in.intersection(arr1,arr2);
        System.out.println(JSONObject.toJSONString(array));
    }
}
