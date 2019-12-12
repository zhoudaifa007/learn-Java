package com.zhou.daqin.jueqi.alibaba.review;

public class Reetcode1071 {

    private String m1;

    private String m2;

    private boolean flag = true;

    public String gcdOfStrings(String str1, String str2) {

        if(str1.length() > str2.length()) {
            m1 = str1;
            m2 = str2;
        } else {
            m1 = str2;
            m2 = str1;
        }

        while (!m2.equals("") && flag){
            helper(m1,m2);
        }

        if(!flag) {
            return "";
        } else {
            return m1;
        }
    }


    private void helper(String s1, String s2) {

        int index =  s1.indexOf(s2);
        if(index == 0) {
            flag = true;
            s1 = s1.substring(s2.length());
            if(s1.length() < s2.length()) {
                m1 = s2;
                m2 = s1;
            } else {
                m1 = s1;
                m2 = s2;
            }
        } else {
            flag = false;
        }
    }
}
