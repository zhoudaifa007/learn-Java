package com.zhou.daqin.jueqi.alibaba.leetcode;


public class Leetcode0213 {

    public int rob(int[] nums) {

        int len = nums.length;

        if(len == 1) {
            return nums[0];
        }
        int[] r_rf = new int[len];
        int[] n_rf = new int[len];

        int[] r_nf = new int[len];
        int[] n_nf = new int[len];

        r_rf[0] = nums[0];

        for(int i = 1; i < len; i++) {
            r_rf[i] = n_rf[i - 1] + nums[i];
            n_rf[i] = Math.max(r_rf[i - 1], n_rf[i - 1]);
            r_nf[i] = n_nf[i- 1] + nums[i];
            n_nf[i] = Math.max(r_nf[i - 1], n_nf[i - 1]);
        }


        return Math.max(n_rf[len - 1], r_nf[len - 1]);
    }


}
