package com.managementsystem.main.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.managementsystem.main.model.student;
import com.managementsystem.main.service.studentservice;

@Controller
public class controllar {
	private studentservice studentservice;

	public controllar(studentservice studentservice) {
		this.studentservice = studentservice;
	}

	@RequestMapping("/student")
	public String show(Model model) {
		List<student> stud = studentservice.findall();
		model.addAttribute("stu", stud);
		return "students";
	}

	@RequestMapping("/new")
	public String insertstudent(Model model) {
		student student = new student();
		model.addAttribute("student", student);
		return "createStudent";
	}

	@RequestMapping("/save")
	public String insertstudent(@ModelAttribute("student") student stu, Model model) {
		studentservice.save(stu);
		return "redirect:/student";
	}

	@RequestMapping("/delete")
	public String deletestudent(@RequestParam("id") int id) {
		studentservice.delete(id);
		return "redirect:/student";
	}

	@RequestMapping("/update")
	public String updatestudent(@RequestParam("id") int id, Model model) {
		student st = studentservice.findById(id);
		model.addAttribute("student", st);
		return "createStudent";

	}

}
