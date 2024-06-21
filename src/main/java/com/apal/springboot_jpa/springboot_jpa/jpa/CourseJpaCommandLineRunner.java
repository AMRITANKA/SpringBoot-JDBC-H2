package com.apal.springboot_jpa.springboot_jpa.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.apal.springboot_jpa.springboot_jpa.entity.Course;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {
	@Autowired
	private CourseJpaRepository courseJpaRepository;

	@Override
	public void run(String... args) throws Exception {
		courseJpaRepository.insert(new Course(1, "Azure", "Author1"));
		courseJpaRepository.insert(new Course(2, "OCI", "Author2"));
		courseJpaRepository.insert(new Course(3, "AWS", "Author3"));
		courseJpaRepository.insert(new Course(4, "GCP", "Author4"));
		courseJpaRepository.deleteById(2);
		Course byId = courseJpaRepository.findById(3);
		System.out.println(byId);

	}

}
