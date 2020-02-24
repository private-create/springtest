package com.baidu.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.alibaba.fastjson.JSON;
import com.baidu.entity.User;

public class Test6 {

	public static void main(String[] args) {
		String path = Test6.class.getClassLoader().getResource("springApplicationContext.xml").getPath();
		ApplicationContext app=new FileSystemXmlApplicationContext(path);
		SqlSessionFactory bean =(SqlSessionFactory) app.getBean("sqlSessionFactory");
		SqlSession openSession = bean.openSession();
		List<User> seachAll = openSession.selectList("com.baidu.service.UserDao.seachAll");
		for (User user : seachAll) {
			String str=JSON.toJSONString(user);
			System.out.println(str);
		}
		
	}

}
