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

import com.capg.App.dto.AppointmentDTO;
import com.capg.App.entity.Appointment;
import com.capg.App.service.AppointmentService;





@RestController
@RequestMapping("/secure")
public class AppointmentController {
	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping("/create")
    public ResponseEntity<String> create(  @RequestBody AppointmentDTO appointmentDTO) throws IOException {
		appointmentService.addAppointment(appointmentDTO);
		return new ResponseEntity<>("Registered" , HttpStatus.CREATED);
    }
	@GetMapping
		public ResponseEntity<List<Appointment>> view(){
			return new ResponseEntity<>(appointmentService.viewAppointments(), HttpStatus.OK);
		}
	
}
