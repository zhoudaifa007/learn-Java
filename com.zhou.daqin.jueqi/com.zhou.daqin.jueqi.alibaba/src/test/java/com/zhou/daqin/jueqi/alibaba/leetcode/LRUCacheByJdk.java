package com.zhou.daqin.jueqi.alibaba.leetcode;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Daifa on 2018/4/7.
 */
public class LRUCacheByJdk {

    private Map<Integer, Integer> map;

    public LRUCacheByJdk(int capacity) {
        map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
            // 定义put后的移除规则，大于容量就删除eldest
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        Integer value = map.get(key);
        if (value == null) {
            return -1;
        } else {
            map.put(key, value);
            return value;
        }
    }

    public void put(int key, int value) {
        map.put(key, value);
    }
}
