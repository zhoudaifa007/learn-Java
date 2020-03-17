package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Leetcode0638Tests {

    @Test
    public void test1() {
        Leetcode0638 leetcode0638 = new Leetcode0638();
        List<Integer> list = Arrays.asList(2,5);
        List<List<Integer>> list1 = Arrays.asList(Arrays.asList(3,0,5),Arrays.asList(1,2,10));
        List<Integer> list2 = Arrays.asList(5,2);
        int i =  leetcode0638.shoppingOffers(list, list1, list2);
        System.out.println(i);
    }
}
