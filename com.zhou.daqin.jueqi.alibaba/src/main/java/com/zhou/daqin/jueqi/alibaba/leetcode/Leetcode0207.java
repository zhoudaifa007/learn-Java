package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.*;

public class Leetcode0207 {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++)
            graph[i] = new ArrayList();

        for (int i = 0; i < prerequisites.length; i++) {
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }

        for (int i = 0; i < numCourses; i++) {
            Set<Integer> set = new HashSet<>();
            if (!dfs(graph,i, set))
                return false;
        }
        return true;
    }

    private boolean dfs(ArrayList[] graph, int course, Set<Integer> set) {
        if(set.contains(course)) {
            return false;
        }
        set.add(course);
        for (int i = 0; i < graph[course].size(); i++) {
            if (!dfs(graph, (int) graph[course].get(i), set))
                return false;
        }
        //如果没有任何依赖，需要删除，否则test2执行失败
        set.remove(course);
        return true;
    }

    public boolean canFinish1(int numCourses, int[][] prerequisites) {
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
            if(nums[i] == 0 && map.containsKey(i)) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int num = queue.poll();
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
                return false;
            }
        }

        return true;
    }
}
