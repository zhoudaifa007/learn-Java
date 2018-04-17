package com.zhou.daqin.jueqi.alibaba.collection;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhoudf2 on 2018-3-22.
 */
public class ConditionBounderBuffer<T> {

    protected final Lock lock = new ReentrantLock();

    private Condition notFull = lock.newCondition();

    private Condition notEmpty = lock.newCondition();

    private T[] items = null;

    private int takeIndex, putIndex, count;

    public ConditionBounderBuffer(int size) {
        items = (T[]) new Object[size];
    }

    public void put(T x) throws InterruptedException {
        lock.lock();
        try {
            while (count == items.length) {
                notFull.await();
            }

            items[putIndex] = x;
            if (++putIndex == items.length) {
                putIndex = 0;
            }
            ++count;
            notEmpty.signal();

        } finally {
            lock.unlock();
        }
    }

    public T take() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0) {
                notEmpty.await();
            }

            T x = items[takeIndex];
            items[takeIndex] = null;
            if (++takeIndex == items.length) {
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
