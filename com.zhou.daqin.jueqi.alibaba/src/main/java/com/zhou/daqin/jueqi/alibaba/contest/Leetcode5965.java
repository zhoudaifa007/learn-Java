package com.zhou.daqin.jueqi.alibaba.contest;

import java.util.*;

public class Leetcode5965 {
    public long[] getDistances(int[] arr) {

        long[] res = new long[arr.length];
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            List<Integer> list = map.getOrDefault(key, new ArrayList<>());
            list.add(i);
            map.put(key, list);
        }


        Iterator<List<Integer>> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            List<Integer> next = iterator.next();
            for (int i = 0; i < next.size(); i++) {
                for (int j = i + i; j < next.size(); j++) {
                    res[next.get(i)] = res[next.get(i)] + Math.abs(next.get(i) - next.get(j));
                    res[next.get(j)] = res[next.get(j)] + Math.abs(next.get(i) - next.get(j));
                }
            }
        }

        return res;
    }
}
