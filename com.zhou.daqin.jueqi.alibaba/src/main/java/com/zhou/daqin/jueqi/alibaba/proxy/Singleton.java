package com.zhou.daqin.jueqi.alibaba.proxy;

/**
 * Created by Daifa on 2018/3/22.
 */
public class Singleton {

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    private Singleton(){
    }

    public static final Singleton getInstance(){
        return SingletonHolder.instance;
    }

}
