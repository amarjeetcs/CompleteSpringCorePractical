package com.spring.core.practical;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
		Student student1=(Student) context.getBean("Student1");
		System.out.println("Using Value as tag-->"+student1);
		
		Student student2=(Student) context.getBean("Student2");
		System.out.println("Using value as attribute-->"+student2);
		
		Student student3=(Student) context.getBean("Student3");
		System.out.println("Using P schema-->"+student3);
	}

}
