package com.zhou.daqin.jueqi.alibaba.number;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class NumberTest {

    @Test
    public void test1(){
        List<Number> list = new ArrayList<Number>();
        list.add(12);
        long t = 12;
        if(list.contains(t))
        {
            System.out.println("contains " + t);
        }
    }

    @Test
    public void test2(){
        int a = 1000, b= 1000;
        System.out.println(a == b);
        Integer c = 1000, d = 1000;
        System.out.println(c == d);
        Integer e = 100,h = 100;
        System.out.println(e == h);
    }
}
