package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentRepo;
//import com.example.dao.StudentRepo;
import com.example.pojos.Students;


@Service
public class StudentImpl{
     
	@Autowired
	private StudentRepo studentrepo;
	
	public List<Students> getDetails()
	{
		return studentrepo.findAll();
	}
	
	public void addStudent(Students student)
	{
		 studentrepo.save(student);
	}

	public Students getStudentById(Integer id) {
		return studentrepo.findById(id).get();
	}

	public Students updateStudent(Students student) {
		return studentrepo.save(student);
	}

	
	public void deleteStudent(Integer id)
	{
		studentrepo.deleteById(id);
	}
}
