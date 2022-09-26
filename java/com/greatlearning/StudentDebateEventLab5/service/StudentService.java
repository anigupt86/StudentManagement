package com.greatlearning.StudentDebateEventLab5.service;

import java.util.List;

import com.greatlearning.StudentDebateEventLab5.Student;


public interface StudentService {
	public List<Student> findAll();
	
	public Student findById(int theId);

	public void save(Student theStudent);

	public void deleteById(int theId);

}
