package com.basepackage.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basepackage.model.Student;
import com.basepackage.service.StudentService;


@RestController
@RequestMapping(path = "api/v1/")
public class StudentController {
	
	@Autowired
	StudentService sService;
	
	@GetMapping
	@RequestMapping(path = "students")
	public List<Student> test() {
		return sService.getAllStudents();
	}

}
