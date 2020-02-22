package com.baidu.test;

import java.net.URL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.baidu.service.CommonDo;
import com.baidu.service.impl.TarigerDo;

public class Test3 {

	public static void main(String[] args) {
		URL resource = Test3.class.getClassLoader().getResource("config.xml");
		ApplicationContext app=new FileSystemXmlApplicationContext(resource.getPath());
		TarigerDo bean = (TarigerDo)app.getBean("proxy");
		bean.speak();
		bean.speakFight("大神");
	}

}
