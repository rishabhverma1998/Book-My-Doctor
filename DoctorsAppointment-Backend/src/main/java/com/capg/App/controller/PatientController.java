package com.capg.App.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.App.dto.PatientDTO;

import com.capg.App.entity.Patient;
import com.capg.App.service.PatientService;

@RestController
@RequestMapping("/secure/patient")
public class PatientController {

	@Autowired
	PatientService patientService;

	public PatientController(PatientService patientService) {
		super();
		this.patientService = patientService;
	}
	
	@PostMapping("/create")
    public ResponseEntity<String> create(  @RequestBody PatientDTO patientDTO) throws IOException {
		patientService.addPatient(patientDTO);
		return new ResponseEntity<>("Registered" , HttpStatus.CREATED);
    }
	@GetMapping
	public ResponseEntity<List<Patient>> view(){
		return new ResponseEntity<>(patientService.viewPatients(), HttpStatus.OK);
	}
}
