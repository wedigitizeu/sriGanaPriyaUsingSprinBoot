package com.wedigitizeu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wedigitizeu.model.Student;

public interface RegisterStudentDAO extends JpaRepository<Student, Integer>{

	
}
