package com.example.demo.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

	private final StudentService studentService;

	// Constructor
	@Autowired // Automatically inject StudentService object (Spring bean) into the constructor
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
    
    @GetMapping // the only REST endpoint we have
	public List<Student> getStudents(){
		return studentService.getStudents();
	}

	@PostMapping
	public void registerNewStudent(@RequestBody Student student) {
		studentService.addNewStudent(student);
	}
}


