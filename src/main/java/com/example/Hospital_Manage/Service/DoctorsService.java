package com.example.Hospital_Manage.Service;

import java.util.List;

import com.example.Hospital_Manage.modelentity.Doctor;


public interface DoctorsService {

	void addDoctor(Doctor doctor);
	
    boolean deleteDoctorById(String id);
    
	Doctor gettingDoctorById(String id);
	
	List<Doctor> getAllDoctors();
	
    Doctor getDoctorById(Long id);
}
