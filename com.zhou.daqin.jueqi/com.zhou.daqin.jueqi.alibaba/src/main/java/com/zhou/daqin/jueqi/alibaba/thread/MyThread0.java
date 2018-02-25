package com.zhou.daqin.jueqi.alibaba.thread;

public class MyThread0 extends Thread {

    private int ticket = 10;
    private String name;
    public MyThread0(String name){
        this.name =name;
    }
    
    public void run(){
        for(int i =0;i<500;i++){
            if(this.ticket>0){
                System.out.println(this.name+"卖票---->"+(this.ticket--));
            }
        }
    }
}
