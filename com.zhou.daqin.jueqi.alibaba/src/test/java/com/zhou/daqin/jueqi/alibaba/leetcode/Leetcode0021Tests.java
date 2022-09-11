package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Leetcode0021Tests {

    @Test
    public void test1() {
        int[] num = {1,2,3,4};
        Leetcode0021 leetcode0021 = new Leetcode0021();
        Arrays.stream(leetcode0021.exchange(num)).forEach(System.out::println);
    }
}
