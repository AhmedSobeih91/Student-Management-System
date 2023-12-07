package com.managementsystem.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.managementsystem.main.model.student;
import com.managementsystem.main.repository.studentrepository;

@Service
public class studentserviceimp implements studentservice {
	private studentrepository studentrepository;

	public studentserviceimp(studentrepository studentrepository) {
		this.studentrepository = studentrepository;
	}

	@Override
	public void save(student student) {
		studentrepository.save(student);
	}

	@Override
	public List<student> findall() {
		List<student> st = studentrepository.findAll();
		return st;
	}

	@Override
	public void delete(int id) {
		studentrepository.deleteById(id);
	}

	@Override
	public void update(student student) {

	}

	@Override
	public student findById(int id) {
		Optional<student> user = studentrepository.findById(id);
		student us = null;
		if (user.isPresent()) {
			us = user.get();
		}
		return us;
	}

}
