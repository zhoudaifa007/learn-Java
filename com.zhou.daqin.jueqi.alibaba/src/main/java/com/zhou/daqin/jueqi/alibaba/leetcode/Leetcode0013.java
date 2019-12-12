package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode0013 {

    private String m;

//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

    private Map<String, Integer> map = new HashMap<>();

    public int romanToInt(String s) {
        initMap();
        m = s;
        int value = 0;

        while (m.length() >= 2) {
            value = value + getValue(m);
        }

        if (m.length() == 1) {
            value = value + map.get(m);
        }
        return value;
    }

    private void initMap() {
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
    }


    private int getValue(String s) {
        String start = s.substring(0, 1);
        String end = s.substring(1, 2);
        int value = 0;

        if (map.get(start) == map.get(end)) {
            m = s.substring(2);
            value = map.get(start) * 2;
        } else if (map.get(start) < map.get(end)) {
            m = s.substring(2);
            value = map.get(end) - map.get(start);
        } else {
            m = m.substring(1);
            value = map.get(start);
        }
        return value;
    }
}
