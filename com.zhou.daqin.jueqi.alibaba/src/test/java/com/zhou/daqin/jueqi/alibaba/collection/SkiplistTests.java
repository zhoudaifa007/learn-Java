package com.zhou.daqin.jueqi.alibaba.collection;

import org.junit.Test;

public class SkiplistTests {

    @Test
    public void test1() {
        Skiplist skiplist  = new Skiplist();
        skiplist.add(1);
        skiplist.add(2);
        skiplist.add(3);
        skiplist.add(4);
        System.out.println("hello");
    }
}
