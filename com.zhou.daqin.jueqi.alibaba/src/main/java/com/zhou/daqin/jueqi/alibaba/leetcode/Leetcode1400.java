package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode1400 {
    public boolean canConstruct(String s, int k) {
        int[] map = new int[26];
        char[] chars = s.toCharArray();

        for(char c: chars) {
            map[ c - 'a']++;
        }

        int oddCount = 0;

        for(int i = 0; i < 26; i++) {
            if(map[i] % 2 == 1) {
                oddCount++;
            }
        }
        return oddCount <= k && s.length() >= k;
    }
}
