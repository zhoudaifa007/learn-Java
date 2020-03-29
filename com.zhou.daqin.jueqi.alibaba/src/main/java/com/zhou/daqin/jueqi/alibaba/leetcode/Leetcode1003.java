package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode1003 {

    public boolean isValid(String S) {
        return mysubString(S).equals("");
    }

    private String mysubString(String s) {
        String s1 =  s.replace("abc","");
        if(s1.length() == s.length()) {
            return s1;
        }
       return mysubString(s1);
    }

}
