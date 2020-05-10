package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0035 {

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return  -1;
        }

        int index = findIndex(nums);

        if(target == nums[index]) {
            return index;
        } else if(target < nums[index] && target >= nums[0]) {
            return binarySearch(nums,0, index, target);
        } else {
            return binarySearch(nums, index + 1, nums.length - 1, target);
        }

    }

    private int findIndex(int[] nums) {
        int length = nums.length;
        if(length == 1) {
            return 0;
        }

        if(nums[length -1] > nums[0]) {
            return length - 1;
        }
        int left = 0;
        int right = length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] > nums[mid + 1]) {
                return mid;
            } else if(nums[left] <= nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return 0;
    }

    private int binarySearch(int[] nums, int left, int right, int target) {

        while (left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(  nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return  -1;
    }
}
