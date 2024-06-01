package com.v.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v.entity.Student;

@RestController
@RequestMapping(path = "/v-api")
public class StudentController {
	
	private static final Logger LOG = LoggerFactory.getLogger(StudentController.class);

	@PostMapping(path = "/saveStudent")
	public Student createStudent(@RequestBody Student student) {
		LOG.info("inside create Student Mehtod....");
		return student;
	}
	
}
