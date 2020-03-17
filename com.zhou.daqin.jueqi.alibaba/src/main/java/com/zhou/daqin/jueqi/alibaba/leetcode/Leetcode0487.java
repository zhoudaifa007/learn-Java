package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0487 {
    public int findMaxConsecutiveOnes(int[] nums) {
         int K = 1;
         int i = 0;
         int j = 0;
         while (i < nums.length) {
             if(nums[i] == 0) K--;

             if(K < 0) {
                 if(nums[j] == 0) {
                     K++;
                 }
                 j++;
             }

             i++;
         }
         return j - i;
    }
}
