package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.Arrays;

public class Leetcode0042 {

    public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;

        int max = 0;
        while (i < j) {
            leftMax = Math.max(leftMax, height[i]);
            rightMax = Math.max(rightMax, height[j]);

            if(leftMax < rightMax) {
                max = max + (leftMax - height[i]);
                i++;
            } else {
                max = max + (rightMax - height[j]);
                j--;
            }
        }

        return max;
    }
    public int trap2(int[] height) {

        int length = height.length;

        int[] left = new int[length];
        int[] right = new int[length];

        for(int i = 1; i < length; i++) {
            left[i] = Math.max(left[i - 1], height[i -1]);
        }

        for(int j =  length - 2; j > -1;  j--) {
            right[j] = Math.max(right[j + 1], height[j + 1]);
        }

        int[] res = new int[length];
        for(int i = 0; i < length; i++) {
            int min = Math.min(left[i], right[i]);
            if(min > height[i]) {
                res[i] = min - height[i];
            }
        }

        return Arrays.stream(res).sum();
    }
}
