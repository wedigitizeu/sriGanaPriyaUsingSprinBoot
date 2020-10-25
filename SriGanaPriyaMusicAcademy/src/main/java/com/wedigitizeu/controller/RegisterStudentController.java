package com.wedigitizeu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wedigitizeu.dao.RegisterStudentDAO;
import com.wedigitizeu.model.Student;

@Controller
public class RegisterStudentController {
	
	@Autowired
	RegisterStudentDAO registerStudent;

	@RequestMapping("/registerStudent")
	public String registerStudent(Model model) {
		model.addAttribute("title", "Student Registration form");
		model.addAttribute("headerTitle", "Student Registration");
		model.addAttribute("student", new Student());
		return "registerStudent";
	}

	@RequestMapping(value = "/saveStudentData", method = RequestMethod.POST)
	public String saveStudentData(@ModelAttribute("student") Student student ,Model model) {

		model.addAttribute("title", "Student Registration form");
		model.addAttribute("headerTitle", "Student Registration");
		model.addAttribute("student", student);
		System.out.println("Student"+student);
		registerStudent.save(student);
		return "registerStudent";
	}

}
