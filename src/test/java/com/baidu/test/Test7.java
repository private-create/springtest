package com.baidu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

public class Test7 {

	public static void main(String[] args) {
		String path = Test7.class.getClassLoader().getResource("spring_quartz.xml").getPath();
		ApplicationContext app=new FileSystemXmlApplicationContext(path);
		SchedulerFactoryBean bean = (SchedulerFactoryBean)app.getBean("SpringJobScheduler");
		bean.start();
	}

}
