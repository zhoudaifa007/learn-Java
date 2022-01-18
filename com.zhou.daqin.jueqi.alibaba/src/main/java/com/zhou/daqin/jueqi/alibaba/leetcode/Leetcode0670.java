package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Leetcode0670 {

    public int maximumSwap(int num) {
        String s  = String.valueOf(num);
        char[] charArr = s.toCharArray();
        int[] numArr = new int[charArr.length];
        for(int i = 0; i < charArr.length; i++) {
            numArr[i] = charArr[i] - '0';
        }

        Map<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();
        int leftIndex = -1;
        for (int i = 0; i < charArr.length - 1; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                if (numArr[i] < numArr[j]) {
                    leftIndex = i;
                    break;
                }
            }
            if (leftIndex > 0) {
                break;
            }
        }

        for (int i = leftIndex + 1; i < numArr.length; i++) {
            set.add(numArr[i]);
            map.put(numArr[i], i);
        }

        int max = set.last();
        int rightIndex = map.get(max);

        int tmp = numArr[leftIndex];
        numArr[leftIndex] = numArr[rightIndex];
        numArr[rightIndex]= tmp;

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < numArr.length; i++) {
            stringBuilder.append(numArr[i]);
        }

        String s1 = stringBuilder.toString();
        return Integer.valueOf(s1);

    }
}
