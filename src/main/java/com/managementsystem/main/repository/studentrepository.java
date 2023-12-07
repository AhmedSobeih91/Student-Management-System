package com.managementsystem.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.managementsystem.main.model.student;

@Repository
public interface studentrepository extends JpaRepository<student, Integer> {

}
