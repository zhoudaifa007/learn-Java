package com.zhou.daqin.jueqi.alibaba.concurrency;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapRemove {

	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "apple");
		map.put("b", "banana");
		int i = 0;
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		 while (it.hasNext()) {
			   Map.Entry<String, String> entry = it.next();
			   it.remove();
			   i = i + 1;
			   if(i == 2)
			   {
			     map.put("c","car");
			   }
			   System.out.println("delete");
      }
		
	}
}
