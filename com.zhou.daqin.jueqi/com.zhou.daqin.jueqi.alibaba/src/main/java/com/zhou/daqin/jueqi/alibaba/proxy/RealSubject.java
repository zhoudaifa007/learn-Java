package com.zhou.daqin.jueqi.alibaba.proxy;

/**
 * Created by zhoudf2 on 2017-7-8.
 */
public class RealSubject implements Interface {

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String args) {
        System.out.println("somethingElse " + args);
    }
}
