package com.baidu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.baidu.service.CommonDo;
import com.baidu.service.impl.TarigerDo;

public class Test4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String url=Test4.class.getClassLoader().getResource("AutoConfig.xml").getPath();
		ApplicationContext app  = new FileSystemXmlApplicationContext(url);
		TarigerDo bean = (TarigerDo)app.getBean("Tariger");
		bean.speak();
		bean.speakFight("雷神");
	}

}
