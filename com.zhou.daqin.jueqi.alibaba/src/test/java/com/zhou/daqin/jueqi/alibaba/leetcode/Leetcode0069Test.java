package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

/**
 * Created by Daifa on 2018/4/14.
 */
public class Leetcode0069Test {

    @Test
    public void test1(){
        int x = Leetcode0069.sqrt(8);
        System.out.println(x);
    }

    @Test
    public void test2(){
        int x = Leetcode0069.sqrt1(2147483647);
        System.out.println(x);
    }

    @Test
    public void test3(){
        int x = Leetcode0069.sqrt1(0);
        System.out.println(x);
         x = Leetcode0069.sqrt1(1);
        System.out.println(x);
        x = Leetcode0069.sqrt1(2);
        System.out.println(x);
        x = Leetcode0069.sqrt1(3);
        System.out.println(x);
        x = Leetcode0069.sqrt1(4);
        System.out.println(x);
    }
}
