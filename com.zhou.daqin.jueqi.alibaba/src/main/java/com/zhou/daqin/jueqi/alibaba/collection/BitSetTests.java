package com.zhou.daqin.jueqi.alibaba.collection;

import org.junit.Test;

import java.util.BitSet;

public class BitSetTests {

    @Test
    public void test1() {
        BitSet bitSet = new BitSet(64);
        int j = (64 - 1) >>> 6;
        for( int i = 0 ;i < 64; i++) {
            bitSet.set(i);
        }
        BitSet bitSet1 = new BitSet(64);
        bitSet1.set(Integer.MAX_VALUE);
        System.out.println(bitSet.size());
    }


























}
