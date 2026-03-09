package com.example.demo.service;

import com.example.demo.entity.Student;

public class StudentService {

	public String saveStudentInDb(Student s) {
		return "Student added";
	}

	public Student getStudentFromDb() {
		Student s = new Student();
		s.setName("shree");
		s.setAddress("pune");
		s.setAge(22);
		s.setRollNo(11);

		return s;
	}
}
