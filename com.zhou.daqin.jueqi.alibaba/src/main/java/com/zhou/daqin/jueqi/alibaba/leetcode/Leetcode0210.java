package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.*;

public class Leetcode0210 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer> res  = new ArrayList<>();
        int[] nums  = new int[numCourses];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i =0; i < prerequisites.length; i++) {
            int varl = prerequisites[i][0];
            int val2 = prerequisites[i][1];
            nums[varl]++;
            List<Integer> list = map.getOrDefault(val2, new ArrayList<>());
            list.add(varl);
            map.put(val2, list);
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i =0 ;i < nums.length; i++) {
            if(nums[i] == 0 ) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int num = queue.poll();
            res.add(num);
            if(map.containsKey(num)) {
                List<Integer> list = map.get(num);
                for(int i = 0; i < list.size(); i++) {
                    int val = list.get(i);
                    if(--nums[val] == 0) {
                        queue.offer(val);
                    }
                }
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                return new int[0];
            }
        }

        int[] resArray  = new int[res.size()];
        for(int i = 0 ;i < res.size(); i++) {
            resArray[i] = res.get(i);
        }
        return resArray;

    }
}
