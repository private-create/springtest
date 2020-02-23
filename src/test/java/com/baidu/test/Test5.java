package com.baidu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.baidu.service.impl.DogDo;
import com.baidu.service.impl.TarigerDo;

public class Test5 {

	public static void main(String[] args) {
		String path = Test5.class.getClassLoader().getResource("springAop.xml").getPath();
		ApplicationContext app=new FileSystemXmlApplicationContext(path);
		DogDo bean =(DogDo) app.getBean("dogDo");
//		bean.speak();
//		bean.speakFight("雷神");
		bean.dog("战胜KKKKKK");
	}

}
