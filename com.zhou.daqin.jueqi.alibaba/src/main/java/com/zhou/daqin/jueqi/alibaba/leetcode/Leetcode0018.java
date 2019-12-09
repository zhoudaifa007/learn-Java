package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

import java.util.*;

public class Leetcode0018 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length < 4) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        int length = nums.length;
        for (int n = 0; n < length - 3; n++) {
            for (int i = n + 1; i < length - 2; i++) {
                int value = target - nums[n] - nums[i];
                for (int j = i + 1, k = length - 1; j < k; ) {
                    if (nums[j] + nums[k] > value) {
                        k--;
                    } else if (nums[j] + nums[k] < value) {
                        j++;
                    } else {
                        List<Integer> array = new ArrayList<>();
                        array.add(nums[n]);
                        array.add(nums[i]);
                        array.add(nums[j]);
                        array.add(nums[k]);
                        String key = "" + nums[n] + nums[i] + nums[j];
                        if (!set.contains(key)) {
                            set.add(key);
                            list.add(array);
                        }
                        if (j + 1 < length && nums[j] == nums[j + 1]) {
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
        }

        return list;
    }
}
