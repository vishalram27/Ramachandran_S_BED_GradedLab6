package com.greatlearning.student.studmgmtsys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.student.studmgmtsys.entity.Student;
import com.greatlearning.student.studmgmtsys.repository.StudentsRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentsRepository repository;

	@Override
	public List<Student> getAll() {
		return repository.findAll();
	}

	@Override
	public void create(Student student) {
		repository.save(student);
	}

	@Override
	public void update(Student student) {
		repository.save(student);
	}

	@Override
	public void deleteById(int studId) {
		repository.deleteById(studId);
	}

	@Override
	public Student getById(int studId) {
		return repository.findById(studId).orElse(null);
	}

}
