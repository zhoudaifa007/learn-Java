package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Leetcode0139Tests {

    @Test
    public void test1() {
        String s = "applepenapple";
        List<String> list = Arrays.asList("apple", "pen");
        Leetcode0139 leetcode0139 = new Leetcode0139();
        boolean flag = leetcode0139.wordBreak(s, list);
    }
}
