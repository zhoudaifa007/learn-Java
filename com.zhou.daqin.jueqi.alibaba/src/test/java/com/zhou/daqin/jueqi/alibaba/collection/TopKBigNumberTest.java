package com.zhou.daqin.jueqi.alibaba.collection;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Daifa on 2018/3/25.
 */
public class TopKBigNumberTest {

    @Test
    public void test1(){
        List<Integer> list = new ArrayList<>();
        list.add(10001);
        list.add(10002);
        Random random = new Random();
        for(int i = 0; i < 10000; i++) {
            list.add(random.nextInt(10000));
        }
        list.add(10003);
        list.add(10004);
        list.add(10005);

        int[] result = TopKBigNumber.getTopkItems(10,list);
        System.out.println(JSONObject.toJSON(result));
    }
}
