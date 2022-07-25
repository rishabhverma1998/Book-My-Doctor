package com.capg.App.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.App.dto.PatientDTO;

import com.capg.App.entity.Patient;
import com.capg.App.repository.PatientRepository;
import com.capg.App.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
	PatientRepository patientRepository;

	public PatientServiceImpl(PatientRepository patientRepository) {
		super();
		this.patientRepository = patientRepository;
	}


	public List<Patient> viewPatients(){
		return new ArrayList<>(patientRepository.findAll());
		
	}
	@Override
	public int addPatient(PatientDTO patientDTO) {
		Patient patient = new Patient();
		patient.setPatientName(patientDTO.getPatientName());        
		patient.setPatientAge(patientDTO.getPatientAge());
		patient.setPatientContactNo(patientDTO.getPatientContactNo());
		patient.setPatientGender(patientDTO.getPatientGender());
		return patientRepository.save(patient).getPatientId();
	}

}
