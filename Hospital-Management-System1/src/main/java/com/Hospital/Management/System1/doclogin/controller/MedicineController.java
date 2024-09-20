package com.Hospital.Management.System1.doclogin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Hospital.Management.System1.doclogin.repository.MedicineRepository;
import com.Hospital.Management.System1.doclogin.entity.Medicine;

@RestController
@RequestMapping("api/v3")
public class MedicineController {
	private MedicineRepository medicineRepository;
	
	public MedicineController(MedicineRepository medicineRepository) {
		super();
		this.medicineRepository = medicineRepository;
	}
	
	@GetMapping
	public List<Medicine> getallMedicine(){
		return medicineRepository.findAll();
	}
	
	@PostMapping("/insert")
	public Medicine createMedicine(@RequestBody Medicine medicine) {
		return medicineRepository.save(medicine);
		
	}
}
