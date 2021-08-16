package com.scholly.appl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scholly.appl.beans.Institute;
import com.scholly.appl.beans.Student;
import com.scholly.appl.services.InstituteServiceImpl;
import com.scholly.appl.services.StudentServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentServiceImpl studService;

	// http://localhost:8090/student/register-student
	@PostMapping("/add-student")
	public Boolean registerStudent(@RequestBody Student stud) {
		return studService.registerStudent(stud);
	}

	// http://localhost:8090/student/login-student
	@PostMapping("/login-student")
	public Boolean loginStudent(@RequestBody Student student) {
		return studService.loginStudent(student.getStudId(), student.getStudPwd());
	}
	
	@GetMapping("/get-details/{id}")
	public Student studentDetails(@PathVariable(value="id") Long studId) {
		System.out.println(studService.getStudentDets(studId));
		return studService.getStudentDets(studId);
	}

}
