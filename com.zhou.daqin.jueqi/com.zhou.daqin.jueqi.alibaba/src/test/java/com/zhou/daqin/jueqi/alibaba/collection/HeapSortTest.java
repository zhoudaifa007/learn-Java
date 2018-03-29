package com.zhou.daqin.jueqi.alibaba.collection;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * Created by Daifa on 2018/3/24.
 */
public class HeapSortTest {

    @Test
    public void test1() {
        int[] array = {1, 2, 3, 4, 5};
        HeapSort.sort(array);
        System.out.println(JSONObject.toJSONString(array));
    }

    @Test
    public void test2() {
        int[] array = {5, 4, 3, 2, 1};
        HeapSort.sort(array);
        System.out.println(JSONObject.toJSONString(array));
    }

    @Test
    public void test3() {
        int[] array = {5, 1, 9, 3, 7,4,8,6,2};
        HeapSort.sort(array);
        System.out.println(JSONObject.toJSONString(array));
    }
}
