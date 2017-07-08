package com.zhou.daqin.jueqi.alibaba.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhoudf2 on 2017-7-8.
 */
public class ServiceInvocationHandler implements InvocationHandler {

    // 目标对象
    private Object target;

    public ServiceInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    /**
     * 创建代理实例
     * @return
     * @throws Throwable
     */
    public Object getProxy() throws Throwable {
        return Proxy.newProxyInstance(Thread.currentThread()
                .getContextClassLoader(), this.target.getClass()
                .getInterfaces(), this);
        // 这样写只返回了目标对象，没有生成代理对象。
        // return target;
    }

    /**
     * 实现InvocationHandler接口方法
     * 执行目标对象的方法，并进行增强
     */
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object result = null;
        System.out.println("代理类方法，进行了增强。。。");
        System.out.println("事务开始。。。");
        // 执行目标方法对象
        result = method.invoke(target, args);
        System.out.println("事务结束。。。");
        return result;
    }

}
