package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Leetcode0347 {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int num: nums) {
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        PriorityQueue<Helper> priorityQueue = new PriorityQueue<>((a, b) -> {
            return a.val - b.val;
        });

        for(Map.Entry<Integer, Integer> e: map.entrySet()) {
            Helper helper = new Helper();
            helper.key = e.getKey();
            helper.val = e.getValue();
            priorityQueue.offer(helper);
            if(priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }

        int[] res = new int[priorityQueue.size()];
        int i = 0;
        while (!priorityQueue.isEmpty()) {
            res[i++] = priorityQueue.poll().key;

        }

        return res;
    }

    class Helper {
        public int key;
        public int val;
    }
}
