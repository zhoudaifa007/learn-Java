package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.*;

public class Leetcode0003 {
    /**
     * the basic idea is, keep a hashmap which stores the characters in string as keys and their positions as values,
     * nd keep two pointers which define the max substring. move the right pointer to scan through the string ,
     * and meanwhile update the hashmap. If the character is already in the hashmap, then move the left pointer to the right of the same character last found. Note that the two pointers can only move forward.
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        for (int i = 0, j = 0; i < s.length(); ++i) {
            //abba
            //防止左侧指针再向左移动
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    /**
     * 最值问题，最容易想到的DP，初始状态，转移方程，最优解
     * 对于这个问题，可以定义maxLength[i] = s[m....i]  的长度，m到i的元素都不重复
     * 还要维护一个Map<int, HashMap<int,char>> 表示以第i个元素结尾，hashmap表，但是为了省空间，我们只需要保存最近一个即可
     * 如果s[m...i + 1] 和s[m....i]的元素都不重复，那么maxLength[i] = maxLength[i- 1] ，同时要更新hashMap
     * 如果s[m...i + 1] 和s[m....i]的元素都重复，那么
     *
     * @param s
     * @return
     */

    public int lengthOfLongestSubstring2(String s) {
        if (s.length() == 0) return 0;
        int[] array = new int[s.length()];
        array[0] = 1;
        Map<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 0);
        for (int i = 1; i < s.length(); ++i) {
            if (!map.containsKey(s.charAt(i))) {
                array[i] = array[i - 1] + 1;
                map.put(s.charAt(i), i);
            } else {
                array[i] = i - map.get(s.charAt(i));
                int j = map.get(s.charAt(i));
                map.clear();
                j = j + 1;
                while (j <= i) {
                    map.put(s.charAt(j), j);
                    j++;
                }
            }
        }
        return Arrays.stream(array).max().getAsInt();
    }

    public int lengthOfLongestSubstring3(String s) {
        Queue<Character> queue = new LinkedList<>();
        int res = 0;
        for (char c : s.toCharArray()) {
            while (queue.contains(c)) {
                queue.poll();
            }
            queue.offer(c);
            res = Math.max(res, queue.size());
        }
        return res;
    }
}
