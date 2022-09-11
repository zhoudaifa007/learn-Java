package com.zhou.daqin.jueqi.alibaba.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogExecutionTimeProxy implements InvocationHandler {

    //The target instance
    private Object invocationTarget;

    public LogExecutionTimeProxy(Object invocationTarget) {
        this.invocationTarget = invocationTarget;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //Start time
        long startTime = System.nanoTime();

        //Invoke the method on the target instance
        Object result = method.invoke(invocationTarget, args);

        //Print the execution time
        System.out.println("Executed method " + method.getName() + " in "
                + (System.nanoTime() - startTime) + " nanoseconds");

        //Return the result to the caller
        return result;
    }
}
