package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.PriorityQueue;

public class Leetcode0215 {

    public int findKthLargest(int[] nums, int k) {
        //默认是个小顶堆
        final PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);


        for (int val : nums) {
            pq.offer(val);

            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}
