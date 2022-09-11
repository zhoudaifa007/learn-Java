package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.*;

public class Leetcode1578 {

    public int minCost(String colors, int[] neededTime) {

        char[] arr = colors.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.size() == 0) {
                stack.push(i);
            } else {
                if (arr[i] != arr[stack.peek()]) {
                    stack.push(i);
                } else {
                    if (neededTime[i] > neededTime[stack.peek()]) {
                        stack.pop();
                        stack.push(i);
                    }
                }
            }
        }


        int leftSum = 0;
        while (stack.size() != 0) {
            leftSum = leftSum + neededTime[stack.pop()];
        }

        int sum = Arrays.stream(neededTime).sum();

        return sum - leftSum;
    }
}
