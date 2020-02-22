package com.baidu.test;

import java.net.URL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.baidu.service.CommonDo;
import com.baidu.service.impl.DogDo;
import com.baidu.util.LogProxy;

public class Test2 {
	
	public static void main(String[] args){
		URL resource = Test2.class.getClassLoader().getResource("SpringBeans.xml");
		ApplicationContext app=new FileSystemXmlApplicationContext(resource.getPath());
		CommonDo commonDo = (CommonDo)app.getBean("logProxy");
		commonDo.speak();
	}
}
