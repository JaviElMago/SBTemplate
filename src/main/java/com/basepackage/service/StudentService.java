package com.basepackage.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basepackage.dao.IStudentRepo;
import com.basepackage.model.Student;

@Service
public class StudentService {
	
	@Autowired
	IStudentRepo studRepo;
	
	public List<Student> getAllStudents(){
		return studRepo.findAll();
	}
	
	@PostConstruct
	private void prepTestData(){
		
		List<Student> testData = new ArrayList<>();
		testData.add(new Student(1l, "Bruce Wayne", "murcielago@hero.com", LocalDate.of(2020, 6, 16), 35));
		testData.add(new Student(2l, "Peter Parker", "spyder69@hero.com", LocalDate.of(2020, 6, 16), 21));
		testData.add(new Student(3l, "Dr. Octupus", "tentacles@villian.com", LocalDate.of(2020, 6, 16), 49));
		testData.add(new Student(4l, "Poison Eve", "bestbody@gothan.com", LocalDate.of(2020, 6, 16), 30));
		
		studRepo.saveAll(testData);
		System.out.println("TEST");
		
	}

}
