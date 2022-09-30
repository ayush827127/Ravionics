package com.ravionics.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ravionics.entities.College;
import com.ravionics.services.Service;
import com.springrest.springrest.entities.Course;

@RestController
public class MyController {

	@Autowired
	private Service s;

	@GetMapping("/home")
	public String home() {
		return "Welcome to Ravionics Company";
	}

	// get the courses
	@GetMapping("/college")
	public List<College> getCollegeDetails() {
		return this.s.getCollegeDetail();

	}

	@GetMapping("/college/{id}")
	public Optional<College> getCollegeDetails(@PathVariable String id) {
		return this.s.getCollegeDetail(Long.parseLong(id));

	}

	@PostMapping("/college")
	public College AddCollege(@RequestBody College college) {
		return this.s.addCollege(college);

	}
	
	@PutMapping("/college")
	public College updateCourse(@RequestBody College college) {
		return this.s.updateCollege(college);

	}
	
	@DeleteMapping("/college/{id}")
	public ResponseEntity<Object> DeleteCollege(@PathVariable String id) {
		try {
			this.s.deleteCollege(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
