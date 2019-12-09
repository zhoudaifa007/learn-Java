package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.Arrays;

public class Leetcode0016 {


    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return -1;
        }
        Arrays.sort(nums);
        int length = nums.length;
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < length - 2; i++) {
            int value = target - nums[i];

            for (int j = i + 1, k = length - 1; j < k; ) {

                if (nums[j] + nums[k] == value) {
                    return target;
                } else if (nums[j] + nums[k] < value) {
                    if (Math.abs(nums[j] + nums[k] - value) < Math.abs(target - res)) {
                        res = nums[i] + nums[j] + nums[k];
                    }
                    j++;
                } else {

                    if (Math.abs(nums[j] + nums[k] - value) < Math.abs(target - res)) {
                        res = nums[i] + nums[j] + nums[k];
                    }
                    k--;
                }
            }

        }
        return res;
    }
}

