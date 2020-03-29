package com.zhou.daqin.jueqi.alibaba.leetcode;


import java.util.HashSet;
import java.util.Set;

public class Leetcode1079 {
    private int count = 0;

    private Set<String> set = new HashSet<>();

    public int numTilePossibilities(String tiles) {
        char[] array = tiles.toCharArray();
        numTilePossibilitiesHelper(array, "", 0, new boolean[array.length], true);
        return set.size();
    }

    private void numTilePossibilitiesHelper(char[] array, String s, int index, boolean[] flag, boolean used) {
        if (index == array.length && s.length() > 0) {
            set.add(s);
        } else {
            for (int i = 0; i < array.length; i++) {

                if (!flag[i]) {
                    char c = array[i];
                    flag[i] = true;
                    numTilePossibilitiesHelper(array, s, index + 1, flag, false);
                    if (used) {
                        s = s + c;
                        numTilePossibilitiesHelper(array, s, index + 1, flag, true);
                        s = s.substring(0, s.length() - 1);
                    }
                    flag[i] = false;
                }
            }
        }
    }
}
