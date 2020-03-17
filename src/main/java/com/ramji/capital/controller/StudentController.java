/**
 * 
 */
package com.ramji.capital.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramji.capital.model.Student;

/**
 * @author Ram Ji Soni
 *
 */
@RestController
@RequestMapping("/students")
public class StudentController {

	@GetMapping(path = "/getallstudent")
	public ResponseEntity<List<Student>> getAllStudent() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(new Long(1), "ramji", "ramji@gmail.com"));
		students.add(new Student(new Long(2), "ramji2", "ramji2@gmail.com"));

		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}

	@GetMapping(path = "/")
	public ResponseEntity<String> home() {

		return new ResponseEntity<String>("hello", HttpStatus.OK);
	}

}
