package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode0784 {

    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while ( i < S.length()) {
            char c = S.charAt(i);
            list = getString(list, c);
            i++;
        }
        return list;
    }

    private List<String> getString(List<String> list, char c) {
        List<Character> characterList = new ArrayList<>();
        if( c - 'a' >= 0 && c - 'z' <=0) {
            characterList.add(c);
            char c2 = Character.toUpperCase(c);
            characterList.add(c2);
         } else if(c - 'A' >= 0 && c - 'Z' <=0) {
            char c2 = Character.toLowerCase(c);
            characterList.add(c2);
            characterList.add(c);
        } else {
            characterList.add(c);
        }
        List<String> list1 = new ArrayList<>();
        if (list != null && list.size() != 0) {
            for (String e1 : list) {
                for (Character e2 : characterList) {
                    list1.add(e1 + e2);
                }
            }
        } else {
            for (Character e2 : characterList) {
                list1.add("" + e2);
            }
        }

        return list1;
    }
}
