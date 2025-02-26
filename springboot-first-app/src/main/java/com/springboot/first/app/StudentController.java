package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/Hello")
	public Student gethi() {
		return new Student("ARAVINDA","KUMAR"); 
	}
	
	@GetMapping("/Hey")
	public List<Student> getStudent(){
		List<Student> students=new ArrayList<>();
		students.add(new Student("Kaliappan","K"));
		students.add(new Student("Jeyanthi","K"));
		students.add(new Student("Dheepan Kumar","K"));
		students.add(new Student("Aravindakumar","K"));
		return students;
	}
}
