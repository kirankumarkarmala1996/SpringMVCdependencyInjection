package com.ConstructerDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Collage {
	public static void main(String[] args) {

//	if we want to inject  the manually using constructor injection developer is responsibility to do the hard code	

//		Teacher tech = new Teacher(10054, "manjula");
//		tech.displayTeacherInfo();

		
//we are injecting the value by spring IOC
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Teacher tech=context.getBean("teacher",Teacher.class);
//		tech.displayTeacherInfo();
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Teacher tec=context.getBean("teacher",Teacher.class);
		tec.displayTeacherInfo();


	}

}
