package com.zhou.daqin.jueqi.alibaba.concurrency;

import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class TaskManager {
	
	public void doStart()
	{
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1); 
	
	 
		for(int i = 0; i < 2 ; i++)
		{
			HanderTask handertask = new HanderTask();
			Future<Integer> handler = executor.submit(handertask);
			WriteFileTask writerfiletask =  new WriteFileTask(i, handler);
			if(i % 2 == 0)
			{
				executor.scheduleAtFixedRate(writerfiletask, 0 , 4000, TimeUnit.MILLISECONDS);
			}
			else
			{
				executor.scheduleAtFixedRate(writerfiletask, 0 , 2000, TimeUnit.MILLISECONDS);
			}
		}
	}
	
	public static void main(String[] args)
	{
		TaskManager tm = new TaskManager();
		tm.doStart();
		
	}
}
