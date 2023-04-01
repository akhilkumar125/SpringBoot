package com.springbootApp.firstproject.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootApp.firstproject.demo1.Course;

public interface CourseSpringDataJpa extends JpaRepository<Course, Long> {
	List <Course>findByAuthor(String author);
	List<Course> findByName(String name);
}
