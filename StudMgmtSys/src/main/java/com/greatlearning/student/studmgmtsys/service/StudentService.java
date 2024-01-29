package com.greatlearning.student.studmgmtsys.service;

import java.util.List;

import com.greatlearning.student.studmgmtsys.entity.Student;

public interface StudentService {

	List<Student> getAll();

	void create(Student student);

	void update(Student student);

	void deleteById(int studId);

	Student getById(int studId);

}
