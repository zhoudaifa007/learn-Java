package com.zhou.daqin.jueqi.alibaba.concurrency;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created by zhoudf2 on 2018-4-8.
 */
public class SemaphoreTest {

    @Test
    public void test1() {
        final int THREAD_COUNT = 30;
        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);
        final Semaphore s = new Semaphore(10);
        final CountDownLatch countDownLatch = new CountDownLatch(THREAD_COUNT);

        long startTime = System.currentTimeMillis();
        for( int i = 0; i < THREAD_COUNT; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        s.acquire();
                        System.out.println("save data");
                        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
                        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
                        Thread.sleep(1000);
                        countDownLatch.countDown();
                    } catch (InterruptedException e) {
                    } finally {
                        s.release();
                    }
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        executorService.shutdown();

    }
}
