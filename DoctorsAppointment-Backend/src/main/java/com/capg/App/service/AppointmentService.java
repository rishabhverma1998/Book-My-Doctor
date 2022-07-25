package com.capg.App.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.App.dto.AppointmentDTO;
import com.capg.App.entity.Appointment;



@Service
public interface AppointmentService {

	public int addAppointment(AppointmentDTO appointmentDTO);

	public List<Appointment> viewAppointments();

}
