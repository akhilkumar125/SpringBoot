package com.springbootApp.firstproject.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootApp.firstproject.jdbc.CourseJdbcRepository;
import com.springbootApp.firstproject.jpa.CourseJpaRepository;
import com.springbootApp.firstproject.springdatajpa.CourseSpringDataJpa;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private CourseSpringDataJpa repository;
	
	
	@Override
	public void run(String... args) throws Exception {
		repository.save((new Course(1, "Learn Spring Framework JPA", "luv2code")));
		repository.save((new Course(2, "Learn Struts Framework JPA", "DurgaSoft")));
		repository.save((new Course(3, "Learn EJB JPA ", "j2ee")));
		
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("DurgaSoft"));
		
		System.out.println(repository.findByName("Learn EJB JPA "));
		
		
		
	}

}
