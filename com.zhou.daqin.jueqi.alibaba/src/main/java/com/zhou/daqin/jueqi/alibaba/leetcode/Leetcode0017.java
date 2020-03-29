package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode0017 {

    Map<Character, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        initMap();
        List<String> res = letterCombinations(digits, digits.length());
        if(res.size() == 1) {
            res = new ArrayList<>();
        }
        return res;
    }

    private void initMap() {
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"qprs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }

    private List<String> letterCombinations(String digits, int index) {
        if(index == 0) {
            String s ="";
            List<String> strings =  new ArrayList<>();
            strings.add(s);
            return  strings;
        }

        Character c = digits.charAt(index - 1);
        String str = map.get(c);
        List<String> stringList = letterCombinations(digits, index - 1);
        List<String> res = new ArrayList<>();
        for(int i = 0 ;i < str.length(); i++) {
            for(String s: stringList) {
                s = s + str.charAt(i);
                res.add(s);
            }
        }
        return res;
    }
}
