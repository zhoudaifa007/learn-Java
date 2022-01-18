package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.*;

public class Leetcode0159 {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        if (s.length() < 1) return 0;
        HashMap<Character, Integer> index = new HashMap<Character, Integer>();
        int lo = 0;
        int hi = 0;
        int maxLength = 0;
        while (hi < s.length()) {
            if (index.size() <= 2) {
                char c = s.charAt(hi);
                index.put(c, hi);
                hi++;
            }
            if (index.size() > 2) {
                int leftMost = s.length();
                for (int i : index.values()) {
                    leftMost = Math.min(leftMost, i);
                }
                char c = s.charAt(leftMost);
                index.remove(c);
                lo = leftMost + 1;
            }
            maxLength = Math.max(maxLength, hi - lo);
        }
        return maxLength;
    }

    public int lengthOfLongestSubstringTwoDistinct1(String s) {
        Queue<Character> queue = new LinkedList<>();
        int res = 0;
        for (char c : s.toCharArray()) {
            queue.offer(c);
            int distNum = getDictNum(queue);
            while (distNum > 2) {
                queue.poll();
                distNum = getDictNum(queue);
            }
            res = Math.max(res, queue.size());
        }
        return res;
    }


    private int getDictNum(Queue<Character> queue) {
        Set<Character> set = new HashSet<>(queue);
        return set.size();
    }
}
