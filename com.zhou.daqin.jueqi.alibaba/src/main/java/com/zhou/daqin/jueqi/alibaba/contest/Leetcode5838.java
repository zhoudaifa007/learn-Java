package com.zhou.daqin.jueqi.alibaba.contest;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Leetcode5838 {


    public static boolean isPrefixString(String s, String[] words) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        int i = 0;
        for (String word : words) {
            map.put(i, word.length());
            i = i + 1;
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        int sIdnex = 0;
        while (iterator.hasNext() && sIdnex < s.length()) {
            Map.Entry<Integer, Integer> next = iterator.next();
            int index = next.getKey();
            int length = next.getValue();

            if (sIdnex + length > s.length()) {
                return false;
            }

            String temp = s.substring(sIdnex, sIdnex + length);
            if (!temp.equals(words[index])) {
                return false;
            }
            sIdnex = sIdnex + length;

        }

        if(sIdnex != s.length()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "iloveleetcode";
        String[] words = {"i", "love", "leetcode", "apples"};
//        String s = "ccccccc";
//        String[] words = {"c","cc"};
       System.out.println(isPrefixString(s, words));
    }
}
