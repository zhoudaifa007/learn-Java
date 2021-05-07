package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0395 {

    public int longestSubstring(String s, int k) {
        char[] str = s.toCharArray();
        return helper(str, 0, s.length(), k);
    }

    private int helper(char[] str, int start, int end, int k) {
        if (end - start < k) return 0;//substring length shorter than k.
        int[] count = new int[26];
        for (int i = start; i < end; i++) {
            int idx = str[i] - 'a';
            count[idx]++;
        }

        for (int j = start; j < end; j++) {
            if (count[str[j] - 'a'] < k) {
                int left = helper(str, start, j, k);
                int right = helper(str, j + 1, end, k);
                return Math.max(left, right);
            }
        }

        return end - start;
    }
}
