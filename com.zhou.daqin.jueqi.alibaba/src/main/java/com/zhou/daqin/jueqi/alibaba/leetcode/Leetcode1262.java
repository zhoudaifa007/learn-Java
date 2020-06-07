package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.*;
import java.util.stream.IntStream;

public class Leetcode1262 {
    public int maxSumDivThree(int[] nums) {

        Arrays.sort(nums);
        Map<Integer, List<Integer>> hashMap = new HashMap<>();
        for (int num : nums) {
            int t = num % 3;
            List<Integer> list = hashMap.getOrDefault(t, new ArrayList<>());
            list.add(num);
            hashMap.put(t, list);
        }

        int sum = IntStream.of(nums).sum();
        List<Integer> list1 = hashMap.get(1);
        List<Integer> list2 = hashMap.get(2);
        if (sum % 3 == 1) {
            if ((list1 != null && list1.size() >= 1) && (list2 == null || list2.size() < 2)) {
                sum = sum - list1.get(0);
            } else if (list1 == null && (list2 != null && list2.size() >= 2)) {
                sum = sum - list2.get(0) - list2.get(1);
            } else {
                sum = sum - Math.min(list1.get(0), list2.get(0) + list2.get(1));
            }
        } else if (sum % 3 == 2) {
            if (list2 != null && list2.size() >= 1 && (list1 == null || list1.size() < 2)) {
                sum = sum - list2.get(0);
            } else if ((list2 == null || list2.size() < 1) && (list1!= null && list1.size() >= 2)) {
                sum = sum - list1.get(0) - list1.get(1);
            } else {
                sum = sum - Math.min(list2.get(0), list1.get(0) + list1.get(1));
            }
        }

        return sum;
    }
}
