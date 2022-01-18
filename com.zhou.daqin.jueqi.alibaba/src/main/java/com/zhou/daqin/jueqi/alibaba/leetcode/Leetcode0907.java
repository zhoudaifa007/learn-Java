package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.*;

public class Leetcode0907 {

    public int sumSubarrayMins(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int length = arr.length;
        for (int i = 0; i < length; i++) {

            for (int k = 1; k <= length - i; k++) {
                List<Integer> m = new ArrayList<>();
                for (int j = i; j -i + 1 <= k ; j++) {
                    m.add(arr[j]);
                }
                int min = Integer.MAX_VALUE;
                for(Integer t: m) {
                    min = Math.min(min,t);
                }
                list.add(min);
            }
        }

        int sum = 0;

        for(Integer t: list) {
            sum = sum + t;
        }

        return sum;
    }

    public int sumSubarrayMins1(int[] A) {
        int mod = (int) Math.pow(10, 9) + 7;
        int n = A.length, res = 0;
        int[] left = new int[n], right = new int[n];
        // right[i] = j means A[j] is the next less element of A[i].
        Arrays.fill(right, n);
        // left[i] = j means A[j] is the previous less or equal element of A[i].
        Arrays.fill(left, -1);
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && A[i] < A[stack.peek()]) {
                right[stack.pop()] = i;
            }
            stack.push(i);
        }
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while(!stack.isEmpty() && A[i] <= A[stack.peek()]) {
                left[stack.pop()] = i;
            }
            stack.push(i);
        }
        for (int i = 0; i < n; i++)  {
            res = (res + A[i] * (i - left[i]) * (right[i] - i) % mod) % mod;
        }
        return res;
    }

    public int sumSubarrayMins2(int[] arr) {
        int mod = (int) Math.pow(10, 9) + 7;
        int res = 0;
        int length = arr.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int[] dp = new int[length];
        dp[0] = arr[0];
        for(int i = 1; i < length; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                dp[i] = (i + 1) * arr[i];
            } else {
                dp[i] = dp[stack.peek()] + (i - stack.peek()) * arr[i];
            }
            stack.push(i);
        }

        for(int i = 0; i < length; i++) {
            res = (res + dp[i]) % mod;
        }

        return res;
    }
}
