package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0060 {
    private  int count = 0;

    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for(int i = 1; i <=n; i++) {
            nums[i -1] = i;
        }
        return getPermutationHelper(nums, "", new boolean[n],k);
    }

    private String getPermutationHelper(int[] nums, String s, boolean[] flag,int k) {
        if(s.length() == nums.length) {
            count++;
            if(count == k) {
                return s;
            }
        } else {
            for(int i = 0; i < nums.length; i++) {
                if(!flag[i]) {
                    s = s + nums[i];
                    flag[i] = true;
                   String s2 = getPermutationHelper(nums, s, flag, k);
                   if(count == k) {
                       return s2;
                   }
                    flag[i] = false;
                    s = s.substring(0,s.length() - 1);
                }
            }
        }
        return s;
    }
}
