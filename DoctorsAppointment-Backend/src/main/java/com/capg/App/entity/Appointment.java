package com.capg.App.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Appointment")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointmentId;
	
	@ManyToOne(optional = false)
    @JoinColumn(name="Patient_Id")
	
	private Patient patient; 
	private String doctorName;
	private String symptoms;
	private LocalDate appointmentDate;

	
	public Appointment() {
		super();
	}




	public Appointment(int appointmentId, Patient patient, String doctorName, String symptoms,
			LocalDate appointmentDate) {
		super();
		this.appointmentId = appointmentId;
		this.patient = patient;
		this.doctorName = doctorName;
		this.symptoms = symptoms;
		this.appointmentDate = appointmentDate;
	}




	public int getAppointmentId() {
		return appointmentId;
	}




	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}




	public Patient getPatient() {
		return patient;
	}




	public void setPatient(Patient patient) {
		this.patient = patient;
	}




	public String getDoctorName() {
		return doctorName;
	}




	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}




	public String getSymptoms() {
		return symptoms;
	}




	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}




	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}




	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}



	

}
