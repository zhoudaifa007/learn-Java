package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.*;

public class Leetcode0310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        int[] degree = new int[n];
        List<Integer> result = new ArrayList<>();
        if (n == 1) {
            result.add(0);
        }

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i =0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            degree[edges[i][0]]++;
            degree[edges[i][1]]++;
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int num = queue.poll();
                tmp.add(num);
                for (int m : graph.get(num)) {
                    degree[m]--;
                    if (degree[m] == 1) {
                        queue.add(m);
                    }
                }
            }
            result = tmp;
        }

        return result;
    }
}
