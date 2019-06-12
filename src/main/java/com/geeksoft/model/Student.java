package com.geeksoft.model;

import java.util.Date;

public class Student {
	private String firstName;
	private String lastName;
	private int id;
	private int age;
	private Date dob;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	

}


//package com.geeksoft.model;
//
//
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//
//
//
//@Entity(name="STUDENT")
//public class Student {
//	@Id
//	@Column(name="ID")
//	private String std_id;
//
//	public String getstd_id() {
//		return std_id;
//	}
//
//	public void setstd_id(String std_id) {
//		this.std_id = std_id;
//	}
//	
//	
//
//}

