package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start =0;
        int end = -1;
        int maxLenght = 0;

        for(int i  =0; i < nums.length; i = i + 1) {
            if(nums[i] == 1) {
                start = i;
                end = i;
                for(int j = i +1; j < nums.length; j++) {
                    if(nums[j] == 1) {
                        end = j;
                        i = j;
                    } else {
                        break;
                    }
                }
                maxLenght = Math.max(maxLenght, end - start + 1);
            }
        }
        return maxLenght;
    }
}
