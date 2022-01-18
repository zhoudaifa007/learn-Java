package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Leetcode0556 {

    public int nextGreaterElement(int n) {
        String str = String.valueOf(n);
        char[] chars = str.toCharArray();
        int length = chars.length;
        int[] numArr = new int[length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < length; i++) {
            numArr[i] = chars[i] - '0';
        }

        int swapIndex = -1;
        int i = length - 1;
        for(; i >=0; i--) {
            while (!stack.isEmpty() && numArr[stack.peek()] > numArr[i]) {
               swapIndex =  stack.pop();
            }

            if(swapIndex != -1 ) {
                int tmp = numArr[swapIndex];
                numArr[swapIndex] = numArr[i];
                numArr[i] = tmp;
                break;
            }
            stack.push(i);
        }

        if(swapIndex == -1) {
            return  -1;
        }

        Arrays.sort(numArr, i + 1, length);

        StringBuilder builder = new StringBuilder();
        for(int c: numArr) {
            builder.append(c);
        }

        long val = Long.valueOf(builder.toString());
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }
}
