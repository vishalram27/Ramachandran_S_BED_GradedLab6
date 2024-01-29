package com.greatlearning.student.studmgmtsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.student.studmgmtsys.entity.Student;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Integer>{

	
}
