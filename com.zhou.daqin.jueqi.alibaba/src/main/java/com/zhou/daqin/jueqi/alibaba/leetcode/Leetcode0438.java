package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode0438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> integerList = new ArrayList<>();
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        init(p, c1);
        int i = 0;
        int j = 0;

        while (i < s.length()) {
            c2[s.charAt(i) - 'a']++;
            if (i - j + 1 == p.length()) {
                boolean flag = isSame(c1, c2);
                if (flag) {
                    integerList.add(j);
                }
                c2[s.charAt(j) - 'a']--;
                j++;
            }
            i++;
        }
        return integerList;
    }

    private void init(String s1, int[] c1) {
        if (s1 == null) {
            return;
        }
        for (int i = 0; i < s1.length(); i++) {
            c1[s1.charAt(i) - 'a']++;
        }
    }

    private boolean isSame(int[] c1, int[] c2) {
        for (int k = 0; k < 26; k++) {
            if (c1[k] != c2[k]) {
                return false;
            }
        }
        return true;
    }
}
