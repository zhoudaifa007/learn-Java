package com.zhou.daqin.jueqi.alibaba.concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Daifa on 2018/3/22.
 */
public class ConditionBlockQueue<T> {

    private final Lock lock = new ReentrantLock();

    private final Condition notFull = lock.newCondition();

    private final Condition notEmpty = lock.newCondition();

    private T[] items;

    private int takeIndex;

    private int putIndex;

    private int count;

    public ConditionBlockQueue(int size){
        this.items = (T[]) new Object[size];
    }

    public void doPut(T x) throws InterruptedException {
        lock.lock();
        try{
            while (count == items.length) {
                notFull.await();
            }
            items[putIndex] = x;
            if(++putIndex == items.length){
                putIndex = 0;
            }
            ++count;
            notEmpty.signal();
        } finally {
            lock.unlock();
        }

    }

    public T doTake() throws InterruptedException {
        lock.lock();
        try {
            while (count ==  0) {
                notEmpty.await();
            }
            T x = items[takeIndex];
            items[takeIndex] = null;
            if(++takeIndex == items.length) {
                takeIndex = 0;
            }
            --count;
            notFull.signal();
            return x;
        } finally {
            lock.unlock();
        }
    }
}
