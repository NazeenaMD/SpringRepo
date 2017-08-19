package com.spring.springService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springbean.MessageBean;

public class WelcomeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     @SuppressWarnings("resource")
	ApplicationContext ctxt=new ClassPathXmlApplicationContext("spring-config.xml");
     MessageBean bean=(MessageBean)ctxt.getBean("messageBean");
     bean.displayMessage();
	}

}
