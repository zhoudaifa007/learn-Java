package com.zhou.daqin.jueqi.alibaba.collection;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class BloomFilterTests {

    //bloom filter原理：https://www.youtube.com/watch?v=uC6Q5m0SSQ0
    //bloom fileter应用：https://juejin.im/post/5cc5aa7ce51d456e431adac5
    //bloom fileter应用：https://crossoverjie.top/2018/11/26/guava/guava-bloom-filter/

    @Test
    public void guavaTest() {
        BloomFilter<Integer> filter = BloomFilter.create(
                Funnels.integerFunnel(),
                100000000,
                0.01);
        for (int i = 0; i < 100000000; i++) {
            filter.put(i);
        }
        long star = System.currentTimeMillis();
        Assert.assertTrue(filter.mightContain(1));
        Assert.assertTrue(filter.mightContain(2));
        Assert.assertTrue(filter.mightContain(3));
        Assert.assertFalse(filter.mightContain(100000000));
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - star));
    }

    @Test
    public void test2() {
        Set<Integer> filter = new HashSet<>(134217728);
        for (int i = 0; i < 100000000; i++) {
            filter.add(i);
            if(i % 10000 == 0) {
                System.out.println(i);
            }
        }
        long star = System.currentTimeMillis();
        Assert.assertTrue(filter.contains(1));
        Assert.assertTrue(filter.contains(2));
        Assert.assertTrue(filter.contains(3));
        Assert.assertFalse(filter.contains(100000000));
        long end = System.currentTimeMillis();
        System.out.println("执行时间：" + (end - star));
    }
}
