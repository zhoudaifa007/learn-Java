package com.frank.basic;

public class ServiceOneBean implements ServiceOne {

	@Override
	public String sayHello()
	{
		System.out.println("Execute method sayHello");
		return "hello";
	}
}
