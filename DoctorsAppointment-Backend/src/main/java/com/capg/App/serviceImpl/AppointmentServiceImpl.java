package com.capg.App.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.App.dto.AppointmentDTO;
import com.capg.App.entity.Appointment;
import com.capg.App.repository.AppointmentRepository;
import com.capg.App.service.AppointmentService;




@Service
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	AppointmentRepository appointmentRepository;

	public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
		super();
		this.appointmentRepository = appointmentRepository;
	}
	
	
	 public List<Appointment> viewAppointments() {
	        return new ArrayList<>(appointmentRepository.findAll());
	    }


	@Override
	public int addAppointment(AppointmentDTO appointmentDTO) {
		Appointment appointment = new Appointment();
		appointment.setDoctorName(appointmentDTO.getDoctorName());
		appointment.setAppointmentDate(appointmentDTO.getAppointmentDate());
		appointment.setSymptoms(appointmentDTO.getSymptoms());
		appointment.setPatient(appointmentDTO.getPatient());
		return appointmentRepository.save(appointment).getAppointmentId();
	}







}
