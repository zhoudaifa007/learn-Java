package com.zhou.daqin.jueqi.alibaba.leetcode;

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
}
