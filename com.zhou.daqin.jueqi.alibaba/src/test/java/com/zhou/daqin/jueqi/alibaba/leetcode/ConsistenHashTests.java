package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.*;

public class ConsistenHashTests {

    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        list.add("10.0.0.1");
        list.add("10.0.0.2");
        list.add("10.0.0.3");
        list.add("10.0.0.4");
        list.add("10.0.0.5");
        list.add("10.0.0.6");
        list.add("10.0.0.7");
        list.add("10.0.0.8");
        ConsistentHash<String> consistenHash = new ConsistentHash<>(list);

        Map<String, Long> map = new HashMap<>();
        for(int i = 0 ; i < 10000; i++) {
          String uuid =    UUID.randomUUID().toString().replace("-", "");
            String s = consistenHash.getShardInfo(uuid);
            map.put(s, map.getOrDefault(s,0L) + 1L);
        }

        System.out.println(JSONObject.toJSONString(map));

    }


    @Test
    public void test2() {
        ConsistentHash<String> consistenHash = new ConsistentHash<>(Arrays.asList("1234"));

        System.out.println(consistenHash.hash("123"));
        System.out.println(consistenHash.hash("124"));
    }
}
