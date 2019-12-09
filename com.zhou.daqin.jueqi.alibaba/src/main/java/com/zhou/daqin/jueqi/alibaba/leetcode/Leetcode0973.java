package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Leetcode0973 {

    public int[][] kClosest(int[][] points, int K) {
        Map<Integer, Integer> map = new HashMap();

        int len = points.length;
        for(int i = 0; i < len; i++) {
            int[] temp = points[i];
            int sqrt = temp[0] * temp[0] + temp[1] * temp[1];
            map.put(i, sqrt);
        }

        final PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                int value1 = o1.getValue();
                int value2 = o2.getValue();
                return value2 - value1;
            }
        });

        map.entrySet().forEach(t -> {
            pq.offer(t);
            if(pq.size()  > K) {
                pq.poll();
            }
        });

        int[][] array = new int[K][];

        int pqLen = pq.size();
        for (int i =0 ; i < pqLen; i++) {
            int key = pq.poll().getKey();
            int[] num =  points[key];
            array[i] =  num;
        }
        return array;
    }
}
