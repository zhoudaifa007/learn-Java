package com.zhou.daqin.jueqi.alibaba.number;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhoudf2 on 2018-2-25.
 */
@RunWith(SpringRunner.class)
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
