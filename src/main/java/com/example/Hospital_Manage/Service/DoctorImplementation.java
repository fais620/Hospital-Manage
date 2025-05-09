package com.example.Hospital_Manage.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital_Manage.modelentity.Doctor;
import com.example.Hospital_Manage.repository.DoctorRepository;


@Service
public class DoctorImplementation implements DoctorsService {

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
		doctorRepository.save(doctor);
		
	}

	
	@Override
	public boolean deleteDoctorById(String id) {
		
		
		if(doctorRepository.existsById(id)) {
			
			System.out.println("The Current Id exits in the database");
			
			doctorRepository.deleteById(id);
			
			System.out.println("The Id details have been deleted from the database");
			
			return true;
			
		} else {		
			
			return false;
			
		}
			
		
	}


	@Override
	public Doctor gettingDoctorById(String id) {
		// TODO Auto-generated method stub
		
		System.out.println("This method had been called");
		
		return doctorRepository.findById(id).orElse(null);
		
	}
	
	 public List<Doctor> getAllDoctors() {
	        return doctorRepository.findAll();
	    }


	@Override
	public Doctor getDoctorById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

