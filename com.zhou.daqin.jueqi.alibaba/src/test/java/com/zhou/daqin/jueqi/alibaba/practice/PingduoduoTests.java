package com.zhou.daqin.jueqi.alibaba.practice;

import com.zhou.daqin.jueqi.alibaba.practice.day0607.Pingduoduo;
import org.junit.Test;

public class PingduoduoTests {

    @Test
    public void test1() {
        int[] a = {2, 2, 2,2};
        Pingduoduo pingduoduo = new Pingduoduo();
        System.out.println(pingduoduo.search( a, 2));
    }

    @Test
    public void test2() {
        int[] a = {1,2, 2, 2,2};
        Pingduoduo pingduoduo = new Pingduoduo();
        System.out.println(pingduoduo.search( a, 2));
    }

    @Test
    public void test3() {
        int[] a = {1,2, 2, 2,3};
        Pingduoduo pingduoduo = new Pingduoduo();
        System.out.println(pingduoduo.search( a, 2));
    }
}
