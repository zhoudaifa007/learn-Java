package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0280 {
    public void wiggleSort(int[] nums) {

        if(nums.length <= 1) {
            return;
        }

        for(int i = 1; i < nums.length; i++) {

            if(i % 2 == 1) {
                if(nums[i] < nums[i - 1]) {
                    swap(nums, i, i - 1);
                }
            } else {
                if(nums[i] > nums[i - 1]) {
                    swap(nums, i, i - 1);
                }
            }
        }

    }

    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
