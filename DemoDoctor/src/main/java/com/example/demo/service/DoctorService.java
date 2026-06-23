package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Doctor;

public interface DoctorService {
	void add(Doctor d);
	List<Doctor> display();
}
