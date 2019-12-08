package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.*;

public class Leetcode015 {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        int length = nums.length;
        for (int i = 0; i < length - 2; i++) {
            int value = -nums[i];

            for (int j = i + 1, k = length - 1; j < k; ) {
                if (nums[j] + nums[k] > value) {
                    k--;
                } else if (nums[j] + nums[k] < value) {
                    j++;
                } else {
                    List<Integer> array = new ArrayList<>();
                    array.add(nums[i]);
                    array.add(nums[j]);
                    array.add(nums[k]);
                    String key = "" + nums[i] + nums[j];
                    if (!set.contains(key)) {
                        set.add(key);
                        list.add(array);
                    }
                    if ( j + 1 < length && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    if (nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                }
            }
        }
        return list;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        int length = nums.length;
        for (int i = 0; i < length - 2; i++) {
            int value = -nums[i];
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (nums[j] + nums[k] == value) {
                        List<Integer> array = new ArrayList<>();
                        array.add(nums[i]);
                        array.add(nums[j]);
                        array.add(nums[k]);
                        String key = "" + nums[i] + nums[j] + nums[k];
                        if (!set.contains(key)) {
                            set.add(key);
                            list.add(array);
                        }
                    }
                }
            }
        }
        return list;
    }


}
