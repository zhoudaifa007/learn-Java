package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0021 {

    public int[] exchange(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {

            if ((nums[fast] & 1) == 1) {
                swap(nums, slow, fast);
                slow++;
            } ;
            fast++;
        }
        return nums;
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        return;
    }
}
