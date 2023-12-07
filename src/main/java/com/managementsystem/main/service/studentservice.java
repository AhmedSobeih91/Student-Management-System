package com.managementsystem.main.service;

import java.util.List;

import com.managementsystem.main.model.student;

public interface studentservice {
	void save(student student);

	List<student> findall();

	void delete(int id);

	void update(student student);

	student findById(int id);

}
