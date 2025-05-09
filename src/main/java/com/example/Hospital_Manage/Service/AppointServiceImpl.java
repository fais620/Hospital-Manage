package com.example.Hospital_Manage.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital_Manage.modelentity.Appointment;
import com.example.Hospital_Manage.repository.AppointmentRepository;


@Service
public class AppointServiceImpl implements AppointService  {

	@Autowired
	private AppointmentRepository appointRepo;

	//@Override

	//	public boolean bookAppointment1(Appointment appointment) {
		
	//        try {
	        	
	//            appointRepo.save(appointment);
	            
	//            return true;
	            
	//        } catch (Exception e) {
	        	
	//            return false;
	//        }
	//    }

	//@Override
	//public boolean addAppointmentDetails(Appointment appointment) {
//		// TODO Auto-generated method stub
// false;
//	}

	public boolean bookAppointment(Appointment appointment) {
	    try {
	       
	        appointRepo.save(appointment); 

	        return true;
	        
	    } catch (Exception e) {
	      
	        e.printStackTrace();

	      
	        return false;
	    }
	}

	
	
	
}
	
	
	
	


