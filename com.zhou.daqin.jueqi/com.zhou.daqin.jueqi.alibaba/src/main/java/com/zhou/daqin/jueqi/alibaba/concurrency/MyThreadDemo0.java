package com.zhou.daqin.jueqi.alibaba.concurrency;

public class MyThreadDemo0 {
    public static void main(String[] args) {
        MyThread0 mt1= new MyThread0("一号窗口");
        MyThread0 mt2= new MyThread0("二号窗口");
        MyThread0 mt3= new MyThread0("三号窗口");
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
