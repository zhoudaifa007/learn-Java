package com.zhou.daqin.jueqi.alibaba.concurrency;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NumberTest {

	public static void main(String[] args)
	{
		List<Number> list = new ArrayList<Number>();
		list.add(12);
		long t = 12;
		if(list.contains(t))
		{
			System.out.println("contains " + t);
		}
	}
}
