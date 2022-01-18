package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1239Tests {

    @Test
    public void test1() {
        List<String> list = Lists.newArrayList("un", "iq");
        Leetcode1239 leetcode1239 = new Leetcode1239();
        leetcode1239.maxLength(list);

    }

    @Test
    public void test2() {
        List<String> list = Lists.newArrayList("cha","r","act","ers");
        Leetcode1239 leetcode1239 = new Leetcode1239();
        leetcode1239.maxLength(list);
    }

    @Test
    public void test3() {
        List<String> list = Lists.newArrayList("jnfbyktlrqumowxd","mvhgcpxnjzrdei");
        Leetcode1239 leetcode1239 = new Leetcode1239();
        leetcode1239.maxLength(list);
    }
}
