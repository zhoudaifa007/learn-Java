package com.zhou.daqin.jueqi.alibaba.concurrency;

public class StaticTest {

	public static void sayHello()
	{
		System.out.println("hello");
	}
	
	public static void main(String[] args)
	{
		StaticTest a = (StaticTest)null;
		a.sayHello();
	}
}
