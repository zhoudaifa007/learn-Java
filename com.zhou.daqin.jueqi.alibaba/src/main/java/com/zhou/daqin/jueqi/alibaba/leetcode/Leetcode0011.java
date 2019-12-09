package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0011 {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;
        while( start < end) {
            int slide = end -start;
            int curArea = Math.min(height[start], height[end]) * slide;
            maxArea = Math.max(maxArea, curArea);
            if(height[start] <= height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxArea;
    }
}
