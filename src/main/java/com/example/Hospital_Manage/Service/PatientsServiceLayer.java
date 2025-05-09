package com.example.Hospital_Manage.Service;

import java.util.List;


import com.example.Hospital_Manage.modelentity.Patients;




public interface PatientsServiceLayer {
	
	
	boolean addPatient(Patients patient);
	
	
	Patients getPatientsById(String id);
	

    boolean deletePatientById(String id);
    
    
    List<Patients> getAllthePatients();

	


	
		
	

}
