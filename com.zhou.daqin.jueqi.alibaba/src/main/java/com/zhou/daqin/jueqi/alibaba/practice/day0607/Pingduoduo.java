package com.zhou.daqin.jueqi.alibaba.practice.day0607;

public class Pingduoduo {

    public int search(int[] nums, int key) {

        int low = 0;
        int high = nums.length - 1;
        int mayIndex = -1;
        while(low <= high) {
            int mid = (low + high) / 2;

            if(nums[mid] > key) {
                high = mid - 1;
            } else if (nums[mid] == key) {
                mayIndex = mid;
                high = mid - 1;
            } else {
                low = mid +1;
            }
        }
        return mayIndex;
    }
}
