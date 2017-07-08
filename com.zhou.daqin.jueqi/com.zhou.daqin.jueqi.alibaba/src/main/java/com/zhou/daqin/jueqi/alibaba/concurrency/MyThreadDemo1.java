package com.zhou.daqin.jueqi.alibaba.concurrency;

public class MyThreadDemo1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //设计三个线程
         MyThread1 mt1 = new MyThread1();
        
//         MyThread1 mt2 = new MyThread1();
//        
//         MyThread1 mt3 = new MyThread1();
         Thread t1 = new Thread(mt1,"一号窗口");
         Thread t2 = new Thread(mt1,"二号窗口");
         Thread t3 = new Thread(mt1,"三号窗口");
         t1.start();
         t2.start();
         t3.start();
    }
}
