package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1087 {

    public String[] expand(String S) {
        int start = 0;
        int end = 0;
        List<String> list = new ArrayList<>();
        while (S.length() > 0) {
            String preStr = get(S);
            S = S.substring(preStr.length());
            list = getString(list, preStr);
        }
        String[] myArray = new String[list.size()];
        list.toArray(myArray);

        return myArray;
    }

    private List<String> getString(List<String> list, String s) {
        if (s.startsWith("{")) {
            s = s.substring(1, s.length() - 1);
        }
        String[] array = s.split(",");
        Arrays.sort(array);
        List<String> list1 = new ArrayList<>();
        if (list != null && list.size() != 0) {
            for (String e1 : list) {
                for (String e2 : array) {
                    list1.add(e1 + e2);
                }
            }
        } else {
            for (String e2 : array) {
                list1.add(e2);
            }
        }
        return list1;
    }

    private String get(String s) {
        int index = s.indexOf("{");

        //没有找到
        if (index == -1) {
            return s;
        } else if (index == 0) {
            int index1 = s.indexOf("}");
            s = s.substring(index, index1 + 1);
        } else {
            s = s.substring(0, index);
        }

        return s;
    }
}
