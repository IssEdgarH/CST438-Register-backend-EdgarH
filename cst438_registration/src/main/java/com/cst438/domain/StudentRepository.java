package com.cst438.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository <Student, Integer> {
	
	 Student findByEmail(String email); 
	
	 Student[] findByNameStartsWith(String name);

	@Query("select e from Student e")
	public List<Student> getAllStudents();

}
