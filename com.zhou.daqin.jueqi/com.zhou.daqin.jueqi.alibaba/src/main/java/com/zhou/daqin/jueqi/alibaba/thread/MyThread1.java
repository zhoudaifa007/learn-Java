package com.zhou.daqin.jueqi.alibaba.thread;

public class MyThread1 implements Runnable{

    private int ticket =10;
    private String name;
    public  void run(){
        for(int i =0;i<500;i++){
            if(this.ticket>0){
                System.out.println(Thread.currentThread().getName()+"卖票---->"+(this.ticket--));
            }
        }
    }
}
