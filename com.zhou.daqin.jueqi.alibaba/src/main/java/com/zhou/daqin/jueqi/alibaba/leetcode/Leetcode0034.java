package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0034 {

    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        if(nums == null || nums.length == 0) {
            return ans;
        }

        if(nums.length == 1 && nums[0] == target) {
            ans[0] = 0;
            ans[1] = 0;
            return ans;
        }

        int left = 0;
        int right = nums.length - 1;


        int i = 0;
        while (left <= right) {
             i = (left + right) / 2;
            if(target == nums[i]) {
                break;
            }

            if (target < nums[i]) {
                right = i - 1;
            } else {
                left = i + 1;
            }
        }

        if( left > right) {
            return ans;
        }

        left = i;
        while (left >= 1 && nums[ left - 1] == nums[ left]) {
            left--;
        }
        ans[0] = left;

        right = i;
        while (right <= nums.length - 2 && nums[ right + 1] == nums[ right]) {
            right++;
        }
        ans[1] = right;

        return ans;
    }
}
