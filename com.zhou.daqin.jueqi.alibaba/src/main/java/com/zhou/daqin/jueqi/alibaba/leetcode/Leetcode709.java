package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode709 {

    //字符串转字符数组
    //字符数组转字符串
    public String toLowerCase(String str) {
        char[]  a = str.toCharArray();
        for(int i = 0; i < a.length; i++) {
            if('A' <= a[i] && a[i] < 'Z' ) {
                a[i] = (char) (a[i] - 'A' + 'a');
            }
        }
        return new String(a);
    }
}
