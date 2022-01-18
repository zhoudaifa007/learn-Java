package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Leetcode0187 {

    public List<String> findRepeatedDnaSequences(String s) {

        Map<String, Integer> map = new HashMap<>();
        for(int i = 0, j = i + 10; j < s.length(); i++, j++) {
            String temp = s.substring(i, j);
            int count = map.getOrDefault(temp,0);
            count = count + 1;
            map.put(temp, count);
        }

        List<String> res = map.entrySet()
                .stream()
                .filter(t -> t.getValue() >= 2)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        return res;
    }
}
