package com.ConstructerDependencyInjection;

public class Teacher {
	private int id;
	private String Teachername;

	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.Teachername = name;
	}

	public void displayTeacherInfo() {
		System.out.println("Teacher id is :" + id + "  and Teacher name is :" + Teachername);
	}

}
