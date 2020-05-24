package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//这个题考的频率很高，也不是很难，完全可以想出来，leetcode把归类到回溯，不是很明白
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

    //递归函数的定义: 前index返回的字符串列表
    private List<String> letterCombinations(String digits, int length) {
        if(length == 0) {
            String s ="";
            List<String> strings =  new ArrayList<>();
            strings.add(s);
            return  strings;
        }

        Character c = digits.charAt(length - 1);
        String str = map.get(c);
        List<String> stringList = letterCombinations(digits, length - 1);
        List<String> res = new ArrayList<>();
        for(int i = 0 ;i < str.length(); i++) {
            for(String item: stringList) {
                item = item + str.charAt(i);
                res.add(item);
            }
        }
        return res;
    }
}
