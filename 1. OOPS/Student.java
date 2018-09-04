package com.corejava.oops;

public class Student {
	private int id;
	private String address;
	private String course;

	
	public Student() {
	}
	
	public Student(int id, String address, String course) {
		super();
		this.id = id;
		this.address = address;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	/*public void setId(int id) {
		this.id = id;
	}*/

	public String getAddress() {
		return address;
	}

	/*public void setAddress(String address) {
		this.address = address;
	}*/

	public String getCourse() {
		return course;
	}

	/*public void setCourse(String course) {
		this.course = course;
	}*/

}
