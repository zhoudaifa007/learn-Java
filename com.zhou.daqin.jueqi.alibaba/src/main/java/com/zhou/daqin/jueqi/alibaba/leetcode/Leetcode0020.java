package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.Stack;

public class Leetcode0020 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i =0 ; i < s.length(); i++) {
            char c  = s.charAt(i);
            if( c == '(') {
                stack.push(')');
            } else if( c == '[') {
                stack.push(']');
            } else if( c == '{') {
                stack.push('}');
            } else {
                if(stack.empty() || stack.pop() !=  c) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
