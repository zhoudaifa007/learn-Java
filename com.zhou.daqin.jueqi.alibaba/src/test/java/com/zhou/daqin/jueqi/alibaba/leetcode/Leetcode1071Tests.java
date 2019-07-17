package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode1071Tests {

    @Test
    public void test1() {
        String str1 = "ABCABC", str2 = "ABC";
        Leetcode1071 leetcode1071 = new Leetcode1071();
        String res = leetcode1071.gcdOfStrings(str1, str2);
        System.out.println("ok");
    }

    @Test
    public void test2() {
        String str1 = "ABABAB", str2 = "ABAB";
        Leetcode1071 leetcode1071 = new Leetcode1071();
        String res = leetcode1071.gcdOfStrings(str1, str2);
        System.out.println("ok");
    }
}
