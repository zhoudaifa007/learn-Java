package com.zhou.daqin.jueqi.alibaba.collection;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class HeapSort2Tests {

    @Test
    public void test1() {
        int[] array = {5, 1, 9, 3, 7, 4, 8, 6, 2};
        HeapSort2.sort(array);
        System.out.println(JSONObject.toJSONString(array));
    }
}
