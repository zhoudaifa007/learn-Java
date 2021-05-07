package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.Stack;

public class Leetcode0678 {
    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();

    public boolean checkValidString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(') {
                stack1.push(i);
            } else if (c == ')') {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                } else if(!stack2.isEmpty()) {
                    stack2.pop();
                } else {
                    return false;
                }
            } else if (c == '*') {
                stack2.push(i);
            }
        }

        //防止右括号不足
        while(!stack1.isEmpty() && !stack2.isEmpty()) {
            Integer value = stack2.pop();
            if (stack1.peek() < value) {
                stack1.pop();
            }
        }

        return stack1.isEmpty();
    }
}
