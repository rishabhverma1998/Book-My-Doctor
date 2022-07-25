package com.capg.App.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.App.entity.Appointment;



@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {

	



}
