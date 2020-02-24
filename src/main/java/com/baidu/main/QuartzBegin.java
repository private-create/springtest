package com.baidu.main;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;



public class QuartzBegin {
	
	private Logger logger=Logger.getLogger(this.getClass().getName());
	
	
	public  void hello(){
		SimpleDateFormat simple=new SimpleDateFormat("yyyy-mm-dd hh:MM:ss");
		Date date=new Date();
		String format = simple.format(date);
		logger.log(Level.INFO, format+"开始执行quzrtz");
	}
}
