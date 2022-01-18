package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Leetcode0503 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        //存储小标
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * n; i++) {
            int index = i % n;
            while (!stack.isEmpty() && nums[stack.peek()] < nums[index]) {
                ans[stack.pop()] = nums[index];
            }
            stack.push(index);
        }

        return ans;

    }
}
