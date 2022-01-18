package com.zhou.daqin.jueqi.alibaba.leetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Leetcode1239 {
    public int maxLength(List<String> arr) {
        int length = arr.size();
        List<String> list = helper(arr, length - 1);

        List<String> collect = list.stream()
                .filter(this::isUnique)
                .collect(Collectors.toList());

        int max = collect
                .stream()
                .mapToInt(v -> v.length())
                .max().orElse(0);
        return max;
    }


    private List<String> helper(List<String> arr, int index) {
        List<String> res = new ArrayList<>();
        if (index == 0) {
            res.add("");
            res.add(arr.get(0));
            return res;
        }

        List<String> temp = helper(arr, index - 1);
        res.addAll(temp);
        for (String s : temp) {
            s = s + arr.get(index);
            res.add(s);
        }
        return res;
    }

    private boolean isUnique(String str) {
        char[] array = str.toCharArray();
        int[] intArray = new int[26];
        for (char c : array) {
            intArray[c - 'a'] += 1;
            if (intArray[c - 'a'] > 1) {
                return false;
            }
        }
        return true;
    }
}
