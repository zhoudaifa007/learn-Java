package com.zhou.daqin.jueqi.alibaba.collection;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;


/**
 * Created by zhoudf2 on 2017-7-8.
 */

public class CollectionTest {

    @Test
    public void test1(){
        System.out.println("fdsafdsafdsaf");
    }

    @Test
    public void test2(){
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<Integer>(5);
        arrayBlockingQueue.add(1);
        arrayBlockingQueue.add(2);
        arrayBlockingQueue.add(3);
        arrayBlockingQueue.add(4);
        arrayBlockingQueue.add(5);
        arrayBlockingQueue.poll();
        System.out.println("add 5");
        try {
            arrayBlockingQueue.put(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("add 6");
    }
}
