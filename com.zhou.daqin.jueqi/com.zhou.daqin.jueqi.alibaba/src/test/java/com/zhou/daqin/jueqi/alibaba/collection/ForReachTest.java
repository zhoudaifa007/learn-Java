package com.zhou.daqin.jueqi.alibaba.collection;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by ZHOUDF2 on 2017-8-17.
 */

public class ForReachTest {

    @Test
    public void testForReach(){
        List<String> list = new ArrayList<>();
        list.add("你好");
        list.add("中国");
        List<String> list1 = new ArrayList<>();
        for (String str:list) {
            list1.add(str);
        }

        System.out.println(JSONObject.toJSONString(list1));

    }

    @Test
    public void testUUID() {
        String str = UUID.randomUUID().toString().replaceAll("-", "");
        System.out.println(str);
    }
}
