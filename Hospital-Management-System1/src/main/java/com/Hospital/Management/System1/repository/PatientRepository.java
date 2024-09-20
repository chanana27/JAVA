package com.Hospital.Management.System1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital.Management.System1.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{

}
