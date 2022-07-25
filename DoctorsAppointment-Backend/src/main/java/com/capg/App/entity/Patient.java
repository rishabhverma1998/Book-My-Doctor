package com.capg.App.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Patient_Id")
	private int patientId;
	
	private String patientName;
	private String patientAge;
	private String patientGender;
	private int patientContactNo; 
	

	public Patient(int patientId, String patientName, String patientAge, String patientGender, int patientContactNo) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientGender = patientGender;
		this.patientContactNo = patientContactNo;
	}


	public Patient() {
		// TODO Auto-generated constructor stub
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
