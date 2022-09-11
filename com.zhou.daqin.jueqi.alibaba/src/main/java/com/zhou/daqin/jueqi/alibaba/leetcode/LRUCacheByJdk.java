package com.zhou.daqin.jueqi.alibaba.leetcode;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Daifa on 2018/4/7.
 */
public class LRUCacheByJdk extends LinkedHashMap<Integer,Integer> {


    private int capacity;

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

    public LRUCacheByJdk(int capacity) {
        super(capacity, 0.75f, true);
    }

    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }
}
