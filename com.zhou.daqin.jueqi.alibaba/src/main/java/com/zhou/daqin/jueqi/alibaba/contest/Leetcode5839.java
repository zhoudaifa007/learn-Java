package com.zhou.daqin.jueqi.alibaba.contest;

import com.zhou.daqin.jueqi.alibaba.leetcode.Leetcode0347;

import java.util.PriorityQueue;

public class Leetcode5839 {

    public static int minStoneSum(int[] piles, int k) {
        int length = piles.length;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(length,(a, b) -> {
            return b - a;
        });

        for(int stone: piles) {
            priorityQueue.add(stone);
        }

        for(int i = 0; i < k; i++) {
           int big =  priorityQueue.poll();
           int s = (big % 2 == 0) ? (big /2)  : (big / 2 +1);
           priorityQueue.add(s);
        }
         int sum = 0;
        while (!priorityQueue.isEmpty()) {
            sum += priorityQueue.poll();
        }

        return sum;
    }

    public static void main(String[] args) {
       int[]  piles = {4,3,6,7};
       int  k = 3;

       String  s = "aaaa bbbb ccc";
       System.out.println(s.trim());
       System.out.println(minStoneSum(piles,k));
    }
}
