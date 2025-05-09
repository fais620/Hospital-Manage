package com.example.Hospital_Manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Hospital_Manage.modelentity.Patients;


public interface PatientsRepository extends JpaRepository<Patients,String> {
	
	


}
