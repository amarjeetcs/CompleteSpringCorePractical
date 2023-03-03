package com.spring.core.practical;

public class Student {
	private int StudentID;
	private String StudentName;
	private String StudentCity;

	public int getStudentID() {
		return StudentID;
	}

	public void setStudentID(int studentID) {
		StudentID = studentID;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentCity() {
		return StudentCity;
	}

	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}

	public Student(int studentID, String studentName, String studentCity) {
		super();
		StudentID = studentID;
		StudentName = studentName;
		StudentCity = studentCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "[StudentID=" + StudentID + ", StudentName=" + StudentName + ", StudentCity=" + StudentCity
				+ "]";
	}

}
