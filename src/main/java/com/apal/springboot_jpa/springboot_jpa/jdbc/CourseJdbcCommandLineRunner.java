package com.apal.springboot_jpa.springboot_jpa.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.apal.springboot_jpa.springboot_jpa.entity.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	@Autowired
	private CourseJdbcRepository courseJdbcRepository;

	@Override
	public void run(String... args) throws Exception {
		courseJdbcRepository.insert(new Course(1, "Azure", "xyz"));
		courseJdbcRepository.insert(new Course(2, "OCI", "fhz"));
		courseJdbcRepository.insert(new Course(3, "AWS", "abc"));
		courseJdbcRepository.insert(new Course(4, "GCP", "ijk"));
		courseJdbcRepository.deleteById(2);
		Course byId = courseJdbcRepository.findById(3);
		System.out.println(byId);

	}

}
