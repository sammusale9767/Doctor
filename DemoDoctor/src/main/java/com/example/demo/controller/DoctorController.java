package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Doctor;
import com.example.demo.service.DoctorService;


@RestController
public class DoctorController {
	
	@Autowired
	private DoctorService ds;
	
	@GetMapping("add")
	public List<Doctor> displayStudents(){
		return ds.display();
	}
	
	@PostMapping("add")
	public void addStudent(Doctor s) {
		ds.add(s);
	}

}
