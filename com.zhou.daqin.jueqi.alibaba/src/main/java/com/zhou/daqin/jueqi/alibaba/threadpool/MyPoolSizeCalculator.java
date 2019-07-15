package com.zhou.daqin.jueqi.alibaba.threadpool;

import java.lang.management.ManagementFactory;
import java.math.BigDecimal;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by zhoudf2 on 2017-7-11.
 */
public class MyPoolSizeCalculator extends PoolSizeCalculator {

    // u need to implement
    protected long getCurrentThreadCPUTime() {
        return ManagementFactory.getThreadMXBean().getCurrentThreadCpuTime();
    }

    // u need to implement
    protected Runnable creatTask() {
        return new AsyncIOTask();
    }

    // u need to implement
    protected BlockingQueue<Runnable> createWorkQueue() {
        return new LinkedBlockingQueue<>();
    }

}