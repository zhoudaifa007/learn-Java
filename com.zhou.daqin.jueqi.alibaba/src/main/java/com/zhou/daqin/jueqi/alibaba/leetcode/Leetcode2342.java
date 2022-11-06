package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Leetcode2342 {

    public int maximumSum(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int num: nums) {
            int sum = getSumOfDigit(num);

            List<Integer> treeSet = map.getOrDefault(sum, new ArrayList<>());
            treeSet.add(num);
            map.put(sum, treeSet);
        }


        int maxNum = -1;

        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> value = entry.getValue();
            int size = value.size();
            if(size >= 2) {
                List<Integer> collect = value.stream().sorted().collect(Collectors.toList());
                maxNum = Math.max(maxNum, collect.get(size - 2) +  collect.get(size - 1));
            }
        }

        return maxNum;
    }

    private   int getSumOfDigit(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
