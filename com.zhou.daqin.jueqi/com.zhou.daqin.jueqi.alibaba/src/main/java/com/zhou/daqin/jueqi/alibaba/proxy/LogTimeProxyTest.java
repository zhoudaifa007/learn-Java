package com.zhou.daqin.jueqi.alibaba.proxy;

import java.lang.reflect.Proxy;

public class LogTimeProxyTest {

	public static void main(String[] args)
	{
		//Create the target instance
		ServiceOne serviceOne = new ServiceOneBean();
		
		//Create the proxy
		ServiceOne proxy = (ServiceOne)Proxy.newProxyInstance(ServiceOne.class.getClassLoader()
				, serviceOne.getClass().getInterfaces()
				, new LogExecutionTimeProxy(serviceOne));
		
		String result = proxy.sayHello();
		
		System.out.println("Result: " + result);
		
	}
}
