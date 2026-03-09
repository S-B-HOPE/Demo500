package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	StudentService ss = new StudentService();

	@PostMapping("addStudent")
	String addStudent(@RequestBody Student s) {

		return ss.saveStudentInDbbbbbbb(s);

	}

	@GetMapping("getStudent")
	Student getStudent() {
		return ss.getStudentFromDb();
	}
}
