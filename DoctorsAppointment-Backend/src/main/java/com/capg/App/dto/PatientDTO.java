package com.capg.App.dto;

import javax.validation.constraints.NotNull;

public class PatientDTO {
	
private int patientId;
	@NotNull
	private String patientName;
	@NotNull
	private String patientAge;
	@NotNull
	private String patientGender;
	@NotNull
	private int patientContactNo; 
	
	public PatientDTO() {
		// TODO Auto-generated constructor stub
	}

	public PatientDTO(int patientId, @NotNull String patientName, @NotNull String patientAge,
			@NotNull String patientGender, @NotNull int patientContactNo) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.patientContactNo = patientContactNo;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(String patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public int getPatientContactNo() {
		return patientContactNo;
	}

	public void setPatientContactNo(int patientContactNo) {
		this.patientContactNo = patientContactNo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
