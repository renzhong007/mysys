package com.mt.ai.test;

public class Student {
	private int studentId;
	private String stuName;
	private int age;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(int studentId, String stuName, int age) {
		super();
		this.studentId = studentId;
		this.stuName = stuName;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
