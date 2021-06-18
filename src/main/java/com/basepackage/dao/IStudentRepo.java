package com.basepackage.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basepackage.model.Student;

@Repository
public interface IStudentRepo extends JpaRepository<Student, Long>{

}
