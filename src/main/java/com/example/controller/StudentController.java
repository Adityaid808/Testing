package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.pojos.Students;
import com.example.service.StudentImpl;

@Controller
public class StudentController {
 
	@Autowired
	private StudentImpl impl;


	@GetMapping("/details")
	public String getAllDetails(Model map)
	{
		List<Students> stud=impl.getDetails();
		map.addAttribute("students", stud);
	    return "details";
	}
	
		
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		// create student object to hold student form data
		Students student = new Students();
		model.addAttribute("student", student);
		return "add-details";		
	}
	@PostMapping("/details")
	public String addStudentDetails(@ModelAttribute("student") Students student)
	{
		impl.addStudent(student);
		return "redirect:/details";
	}
	

	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Integer id, Model model) {
		model.addAttribute("student", impl.getStudentById(id));
		return "edit-page";
	}
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Integer id,
			@ModelAttribute("student") Students student) {
		
		// get student from database by id
		Students existingStudent = impl.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFname(student.getFname());
		existingStudent.setLname(student.getLname());
		existingStudent.setEmail(student.getEmail());
		
		// save updated student object
		impl.updateStudent(existingStudent);
		return "redirect:/details";		
	}
	
	
	
	@GetMapping("/students/{id}")
	public String deleteDetails(@PathVariable Integer id)
	{
		impl.deleteStudent(id);
		return "redirect:/details";
	}
	
	
}
