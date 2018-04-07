package com.zhou.daqin.jueqi.alibaba.collection;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * Created by Daifa on 2018/4/6.
 */
public class QuickSortTest {

    @Test
    public void test1() {
        int[] array = {5, 3, 4, 7, 1, 6, 2, 8, 9};
        QuickSort.quickSort(array);
        System.out.println(JSONObject.toJSON(array));
    }

    @Test
    public void test2() {

    }
}
