package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.Arrays;

public class Leetcode0041 {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 1) {
            return;
        }

        int replace = nums.length - 2;
        while (replace >=0) {
            if(nums[replace] < nums[replace + 1]) {
                break;
            }
            replace--;
        }

        if(replace < 0) {
            Arrays.sort(nums);
            return;
        }

        int gtIndex = replace + 1;
        while (gtIndex < nums.length && nums[gtIndex] > nums[replace]) {
            gtIndex++;
        }

        int temp = nums[replace];
        nums[replace] = nums[gtIndex - 1];
        nums[gtIndex - 1] = temp;

        Arrays.sort(nums, replace + 1, nums.length);
    }
}
