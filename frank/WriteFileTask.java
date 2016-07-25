package com.frank;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


public class WriteFileTask extends TimerTask {

	private int taksid;
	private Future<Integer> handler;
	
	public WriteFileTask(int taskid,Future<Integer> handler)
	{
		this.taksid = taskid;
		this.handler = handler;
	}
	@Override
	public void run() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println(df.format(new Date()) + " TaskID:" + taksid + " get ");//"" new Date()为获取当前系统时间
	}

}
