package com.capg.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.App.entity.Patient;


@Repository
public interface PatientRepository  extends  JpaRepository<Patient,Integer>{

}
