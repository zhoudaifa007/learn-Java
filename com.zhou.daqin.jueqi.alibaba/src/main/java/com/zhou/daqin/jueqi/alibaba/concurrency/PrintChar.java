package com.zhou.daqin.jueqi.alibaba.concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintChar {

    private static Lock lock = new ReentrantLock();

    //条件变量键值对
    private  static Map<Character, Condition> conditionMap = new HashMap<>();

    //余数键值对
    private  static Map<Character,Integer>  countMap = new HashMap<>();

    //打印的序列号
    private  static AtomicInteger seq = new AtomicInteger(0);

    //打印次数
    private static final int PRINT_COUNT = 20;


    private static void init(){
        conditionMap.put('a', lock.newCondition());
        conditionMap.put('b',lock.newCondition());
        conditionMap.put('c',lock.newCondition());

        countMap.put('a',0);
        countMap.put('b',1);
        countMap.put('c',2);
    }

    public static void main(String[] args) throws Exception {
        init();
        Thread a = new PrintTask('a');
        Thread b = new PrintTask('b');
        Thread c = new PrintTask('c');
        a.start();
        b.start();
        c.start();
    }


    static public class PrintTask extends Thread {
        private Character ch;

        public PrintTask(Character ch) {
            this.ch = ch;
        }

        @Override
        public void run(){
            lock.lock();
            try{
                for(int i = 0; i < PRINT_COUNT; i++) {
                    Integer divLeft = countMap.get(ch);
                    Condition condition = conditionMap.get(ch);
                    while(seq.get() % 3 != divLeft) {
                        condition.await();
                    }
                    System.out.print(ch);
                    seq.getAndIncrement();
                    Condition nextCondition = getNextCondition(ch);
                    nextCondition.signal();
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        //获取下一个条件变量
        private Condition getNextCondition(Character ch) {
            Character nextCh = ' ';
            if(ch == 'a')  {
                nextCh = 'b';
            }

            if(ch == 'b') {
                nextCh = 'c';
            }

            if(ch == 'c') {
                nextCh = 'a';
            }

            return conditionMap.get(nextCh);
        }

    } //printTask结束
}
