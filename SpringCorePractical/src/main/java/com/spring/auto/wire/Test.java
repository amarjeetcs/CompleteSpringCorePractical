package com.spring.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/auto/wire/autoconfig.xml");
		Address ad=(Address) context.getBean("address");
		System.out.println(ad);
		
		Emp emp=(Emp) context.getBean("emp1");
		System.out.println(emp);
		
	}

}
