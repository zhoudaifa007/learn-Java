package com.zhou.daqin.jueqi.alibaba.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zhoudf2 on 2017-7-8.
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    public DynamicProxyHandler(Object proxied)
    {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy:" + proxy.getClass() + ". method: " + method + ". args" + args);
        if(args != null)
            for(Object arg: args)
            {
                System.out.println(" " + args);
            }
        return method.invoke(proxied, args);
    }
}
