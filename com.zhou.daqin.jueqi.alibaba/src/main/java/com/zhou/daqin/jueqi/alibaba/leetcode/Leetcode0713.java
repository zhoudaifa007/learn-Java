package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int start = 0;
        int count = 0;
        while(start < nums.length ) {
            int temp = nums[start];

            if(temp < k) {
                count++;
            }

            int end = start + 1;
            while (end < nums.length ) {
                temp = temp * nums[end];
                if(temp < k) {
                    count++;
                } else {
                    break;
                }
                end++;
            }
            start++;
        }
        return count;
    }

    public int numSubarrayProductLessThanK2(int[] nums, int k) {
        if(k <= 1) {
            return 0;
        }
        int start = 0;
        int count = 0;
        int end = 0;
        int temp = 1;
        while(end < nums.length ) {
            temp = temp * nums[end];
            while (temp >= k ) {
                temp = temp / nums[start];
                start++;
            }
            count = count + end - start + 1;
            end++;
        }
        return count;
    }
}
