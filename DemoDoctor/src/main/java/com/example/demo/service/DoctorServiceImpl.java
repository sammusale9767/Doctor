package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Doctor;
import com.example.demo.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	@Autowired
	private DoctorRepository dr;
	@Override
	public void add(Doctor d) {
		// TODO Auto-generated method stub
		dr.save(d);

	}

	@Override
	public List<Doctor> display() {
		// TODO Auto-generated method stub
		return dr.findAll();
	}

}
