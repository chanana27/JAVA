package com.Hospital.Management.System1.doclogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Hospital.Management.System1.doclogin.entity.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {

}
