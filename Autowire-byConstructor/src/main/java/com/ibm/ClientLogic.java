package com.ibm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientLogic {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");

		Categories ct = (Categories) context.getBean("id1");
		ct.show();

		((ClassPathXmlApplicationContext) context).close();
	}

}