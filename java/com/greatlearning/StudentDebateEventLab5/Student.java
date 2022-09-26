package com.greatlearning.StudentDebateEventLab5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	// define fields
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "department")
	private String department;

	@Column(name = "country")
	private String country;

	// define constructors
	public Student() {

	}

	public Student(String name, String department, String country) {
		super();

		this.name = name;
		this.department = department;
		this.country = country;
	}

	public int getStudentId() {
		return id;
	}

	public void setStudentId(int studentId) {
		id = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// define tostring
	@Override
	public String toString() {
		return "Student [StudentId=" + id + ", Name=" + name + ", Department=" + department + ", country="
				+ country + "]";
	}
	
	
	
		
}
