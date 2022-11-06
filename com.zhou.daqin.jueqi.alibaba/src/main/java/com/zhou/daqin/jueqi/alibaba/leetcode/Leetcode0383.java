package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode0383 {

    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            count = count + 1;
            map.put(c, count);
        }

        for (char c : ransomNote.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            if (count <= 0) {
                return false;
            }
            count = count - 1;
            map.put(c, count);
        }

        return true;
    }
}
