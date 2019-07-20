package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Leetcode692 {

    public List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> m = new HashMap<>();
        for (String w : words) {
            m.put(w, 1 + m.getOrDefault(w, 0));
        }

        final PriorityQueue<Map.Entry<String,Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                int value1 = o1.getValue();
                int value2 = o2.getValue();
                if(value1 > value2) {
                    return 1;
                } else if ( value1 < value2) {
                    return -1;
                } else {
                    return o2.getKey().compareTo(o1.getKey());
                }
            }
        });

        m.entrySet().forEach(t -> {
            pq.offer(t);
            if(pq.size()  > k) {
                pq.poll();
            }
        });

        List<String> list = new ArrayList<>();

        while( pq.size() != 0) {
            list.add(0,pq.poll().getKey());
        }

        return list;
    }
}
