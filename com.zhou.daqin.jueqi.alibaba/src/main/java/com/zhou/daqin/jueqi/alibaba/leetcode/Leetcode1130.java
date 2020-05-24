package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.Stack;

//思路值：值越大，应该放到越上层，避免参与去和运算
public class Leetcode1130 {
    public int mctFromLeafValues(int[] arr) {
        int ans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        for(int cur: arr) {
            while (stack.peek() <= cur) {
                int drop = stack.pop();
                ans += drop * Math.min(stack.peek(),cur);
            }
            stack.push(cur);
        }
        while (stack.size() > 2) {
            ans += stack.pop() * stack.peek();
        }

        return ans;
    }
}
