package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode1557 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        for(List<Integer> integerList: edges) {
            set.add(integerList.get(0));
            set1.add(integerList.get(1));
        }

        for(Integer integer:set1) {
            set.remove(integer);
        }

        List<Integer> targetList = new ArrayList<>(set);
        return targetList;
    }
}
