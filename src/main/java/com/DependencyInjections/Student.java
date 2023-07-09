package com.DependencyInjections;

public class Student {
	// dependency
	private int id;
	private String studentName;

//	here we are injecting the dependency into dependent obj by manually using setter method
//  here i'm injecting the value for the dependency using the setter injection(method)
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void displayStudentINFO() {
		System.out.println("student name is :" + studentName + "   and the id is : " + id);
	}

}
