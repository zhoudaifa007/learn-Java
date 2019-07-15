package com.zhou.daqin.jueqi.alibaba.collection;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

/**
 * Created by Daifa on 2018/4/7.
 */
public class MaxArraySumTest {

    @Test
    public void test1() {
        int[] array = {1,-2,3,10,-4,7,2,-5};

        long num = MaxArraySum.getMax(array);
        System.out.println(num);
    }
}
