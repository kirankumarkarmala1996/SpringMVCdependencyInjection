package com.DependencyInjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
//		Student stu = new Student();
//		// dependent //dependency
//		stu.studentName = "kirankumar";
////		or else we can assen like this
//		stu.displayStudentINFO();//student name is :kirankumar
		
		
		// here we are doing hardcode the vlaue 
//		Student stu = new Student();
//		stu.setStudentName("kamsala kiran kumar");
//		stu.displayStudentINFO();
 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student stu=context.getBean("student",Student.class);
		stu.displayStudentINFO();
		
		Student name=context.getBean("kiran",Student.class);
		name.displayStudentINFO();
		
		
		
		
	}

}
