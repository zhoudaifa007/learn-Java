package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.*;

public class Leetcode0213 {

    public int rob(int[] nums) {
        int max = max(nums);
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums.length - 1 -i];
        }
        int max1 = max(arr);
        return  Math.max(max,max1);
    }

    public int max(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        dp[0]  = nums[0];
        map.put(0,1);
        if(dp.length >= 2) {
            dp[1] = Math.max(nums[0], nums[1]);
            if(nums[1] >= nums[0]) {
                dp[1] = nums[1];
            } else {
                dp[1] = nums[0];
                map.put(1,1);
            }
        }
        boolean flag = false;
        for(int i = 2; i < dp.length; i++) {
            if(dp[i-1] >= dp[i -2] + nums[i]) {
                dp[i] = dp[i-1];
                if(map.containsKey( i - 1)) {
                    map.put(i,1);
                }
            } else {
                dp[i] = dp[i -2] + nums[i];
                if(map.containsKey(i -2)){
                    map.put(i, 1);
                }
                if(i == dp.length - 1) {
                    flag = true;
                }
            }
        }


        if(map.containsKey(dp.length - 1) && flag) {
            dp[dp.length - 1] = dp[dp.length - 1] - Math.min(nums[0], nums[nums.length - 1]);
        }
        if(dp.length >= 2) {
            dp[dp.length - 1] = Math.max(dp[dp.length - 2],dp[dp.length - 1]);
        }

        return dp[dp.length - 1];
    }


}
