package com.spring.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/auto/wire/annotation/autoconfig.xml");
		/*
		 * Address ad=(Address) context.getBean("temp1"); System.out.println(ad);
		 */
		
		Emp emp=(Emp) context.getBean("emp1");
		System.out.println(emp);
		
	}

}
