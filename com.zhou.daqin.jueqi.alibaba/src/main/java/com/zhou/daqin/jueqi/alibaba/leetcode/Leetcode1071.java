package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode1071 {

    //gcdOfStrings(str1.substring(str2.length()), str2),这是第一步应该想到的，这一步和字符串内容完全没有关系
    //第二部应该想到，如果s1 < s2,应该交换位置, 这一步是第一步密切相关的
    //第三部应该想到，如果不匹配，返回""，


    //关键点：递归
    //关键点：startwith

    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) { return gcdOfStrings(str2, str1); } // make sure str1 is not shorter than str2.
        else if (!str1.startsWith(str2)) { return ""; } // shorter string is not common prefix.
        else if (str2.isEmpty()) { return str1; } // gcd string found.
        else { return gcdOfStrings(str1.substring(str2.length()), str2); } // cut off the common prefix part of str1.
    }
}
