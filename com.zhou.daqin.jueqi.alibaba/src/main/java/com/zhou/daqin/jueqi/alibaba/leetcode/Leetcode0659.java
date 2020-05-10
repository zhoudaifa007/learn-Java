package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.*;

public class Leetcode0659 {

    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        //It took me a long time to understand this algo. To summarize, the map variable "appendfreq", stands for the "qualification" of current number, to be appended to the previous sequence.
        Map<Integer, Integer> appendFreq = new HashMap<>();
        for (int i : nums) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        //返回false的条件，freq还包含次数不为了0的值，且不是要期待的值，且不满足开辟新值的要求
        for (int i : nums) {
            if (freq.get(i) == 0) {
                continue;
            } else if (appendFreq.getOrDefault(i, 0) > 0) {  //如果真的有这个元素
                appendFreq.put(i, appendFreq.get(i) - 1);
                appendFreq.put(i + 1, appendFreq.getOrDefault(i + 1, 0) + 1); //可以被追加的位置加一
            } else if (freq.getOrDefault(i + 1, 0) > 0 && freq.getOrDefault(i + 2, 0) > 0) {
                freq.put(i + 1, freq.get(i + 1) - 1);
                freq.put(i + 2, freq.get(i + 2) - 1);
                appendFreq.put(i + 3, appendFreq.getOrDefault(i + 3, 0) + 1);
            } else {
                return false;
            }
            freq.put(i, freq.get(i) - 1);
        }
        return true;
    }
}
