package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.Stack;

public class Leetcode1762 {


    public int[] findBuildings(int[] heights) {
        int len = heights.length;
        Stack<Integer> stack = new Stack<>();
        for(int i = len -1; i >=0; i--) {
            if(stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i);
            }
        }

        int size = stack.size();
        int[] res = new int[size];
        int index = 0;
        while (!stack.isEmpty()) {
            res[index++] = stack.pop();
        }

        return res;
    }
}
