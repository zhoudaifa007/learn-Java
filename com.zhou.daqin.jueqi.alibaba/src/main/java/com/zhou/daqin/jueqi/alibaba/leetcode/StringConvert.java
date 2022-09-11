package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringConvert {

//    Example 1:
//    In:
//    A && B && C
//
//    A => (E || F)
//    C => (G || H)
//
//    Out:
//            (E || F) && B && (G || H)
//
//
//    Example 2:
//    In:
//    A && ( AB ||  C ) && ABC
//
//    A => (F || G)
//    AB => (A && D)
//
//    Out:
//            (F || G) && ((A && D) || C) && ABC
    public  static  String convert(String s, Map<String, String> map) {

        List<String> termList = new ArrayList<>();

        int length = s.length();
        int i = 0;
        int j = 0;
        for(; j < length; j++) {
            if(s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') {
                continue;
            } else {
                String term = s.substring(i,j);
                termList.add(term);
                i = j;
            }
        }
        termList.add(s.substring(i,j));

        System.out.println(termList);

        StringBuilder builder = new StringBuilder();

        for(String term: termList) {
           String termConvert =  map.get(term.trim());
           if(termConvert != null) {
               builder.append(termConvert);
           } else {
               builder.append(term);
           }
        }


        return builder.toString();
    }


    public static void main(String[] args) {
        String s = "A && ( AB ||  C ) && ABC";

        Map<String, String> map = new HashMap<>();

        map.put("A","(F || G)");
        map.put("AB","(A && D)");
        System.out.println(convert(s, map));

    }


}
