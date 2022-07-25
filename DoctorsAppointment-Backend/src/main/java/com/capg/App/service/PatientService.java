package com.capg.App.service;

import java.util.List;

import com.capg.App.dto.PatientDTO;

import com.capg.App.entity.Patient;

public interface PatientService {
	public int addPatient(PatientDTO patientDTO);

	

	public List<Patient> viewPatients();
	
}
