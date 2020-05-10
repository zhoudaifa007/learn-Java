package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode0523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length < 2) {
            return false;
        }
        k = Math.abs(k);

        for(int i = 1; i < nums.length; i++) {
            if( nums[i] + nums[i - 1] == 0) {
                return true;
            }
        }

        if( k == 0) {
            for(int i = 1; i < nums.length; i++) {
                if( nums[i] + nums[i - 1] == k) {
                    return true;
                }
            }
            return false;
        }

        if(k ==1) {
            return true;
        }

        int[] sum = new int[nums.length];
        sum[0] = nums[0];

        for(int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);

        for(int i =0 ; i < sum.length; i++) {
            int num = sum[i] % k;

            Integer pre = map.get(num);
            if(pre != null && i - pre > 1) {
                return true;
            }  else {
                map.put(num, i);
            }

        }

        return false;
    }

    public boolean checkSubarraySum1(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(){{put(0,-1);}};;
        int runningSum = 0;
        for (int i=0;i<nums.length;i++) {
            runningSum += nums[i];
            if (k != 0) runningSum %= k;
            Integer prev = map.get(runningSum);
            if (prev != null) {
                if (i - prev > 1) return true;
            }
            else map.put(runningSum, i);
        }
        return false;
    }
}
