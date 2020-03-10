package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
}
