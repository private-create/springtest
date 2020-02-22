package com.baidu.test;

import java.net.URL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.baidu.service.CommonDo;
import com.baidu.service.impl.BridDo;
import com.baidu.service.impl.DogDo;

public class Test1 {
	
	public static void main(String[] args){
		URL resource = Test1.class.getClassLoader().getResource("SpringBeans.xml");
		ApplicationContext context=new FileSystemXmlApplicationContext(resource.getPath());
		CommonDo dog = (CommonDo)context.getBean("a");
		CommonDo brid = (CommonDo)context.getBean("bridDo");
		dog.speak();
		DogDo dog1=(DogDo)dog;
		BridDo brid1=(BridDo)brid;
		dog1.dog();
		brid.speak();
		brid1.brid();
	}
}
