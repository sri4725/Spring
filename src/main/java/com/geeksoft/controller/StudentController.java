package com.geeksoft.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.geeksoft.model.Student;
import com.geeksoft.service.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;


	@RequestMapping(value = "/getStudent/{student-id}")
	public Student getStudent(@PathVariable("student-id") String studentId) {
		return studentService.getStudent(studentId);
	}

	@RequestMapping(value = "/getStudents")
	public List<Student> getStudents() {
		// System.out.println("Student id is " + studentId);
		return new ArrayList<Student>();
	}
	@RequestMapping(value = "/getStudentName")
	public String getStudentName() {
		String name="sreedhar";
		return name;
		
	}
}

