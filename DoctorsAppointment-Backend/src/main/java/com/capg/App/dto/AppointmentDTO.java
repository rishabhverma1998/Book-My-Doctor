package com.capg.App.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.capg.App.entity.Patient;



public class AppointmentDTO {

	private int appointmentId;
	@NotNull
	private Patient patient;
	@NotNull
	private String doctorName;
	@NotNull
	private LocalDate appointmentDate;
	@NotNull
	private String symptoms;
	
	
	public AppointmentDTO() {
		super();
	}




	public AppointmentDTO(int appointmentId, @NotNull Patient patient, @NotNull String doctorName,
			@NotNull LocalDate appointmentDate, @NotNull String symptoms) {
		super();
		this.appointmentId = appointmentId;
		this.patient = patient;
		this.doctorName = doctorName;
		this.appointmentDate = appointmentDate;
		this.symptoms = symptoms;
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


	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}


	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}


	

	public String getSymptoms() {
		return symptoms;
	}




	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
	
	

}
