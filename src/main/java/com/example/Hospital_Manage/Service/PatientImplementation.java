package com.example.Hospital_Manage.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Hospital_Manage.modelentity.Patients;
import com.example.Hospital_Manage.repository.PatientsRepository;

@Service
public class PatientImplementation implements PatientsServiceLayer {

	
  @Autowired
  private PatientsRepository patientrepository;
 



  @Override
  public Patients getPatientsById(String id) {
	// TODO Auto-generated method stub
	
	   return patientrepository.findById(id).orElse(null);
	    
	
	
      }






    @Override
    public boolean addPatient(Patients patient) {
    	
    	try {
    	
    	System.out.println("The addPatient method has been called from the service layer");
    	
    	patientrepository.save(patient);
    	
        return true;
        
       }catch (Exception e) {
    	
    	System.out.println("Patients data does not save in the database it is throwing error" + e.getMessage());
    	
    	return false;
    	
    	
              }
    	
    	
    }


	@Override
	public boolean deletePatientById(String id) {
		
		
    if (patientrepository.existsById(id)) {
    	
	    	
		    System.out.println("The Particular PatientId exists in the database" + id);
		      
            patientrepository.deleteById(id);
          
            System.out.println("The Particular PatientId has been deleted from the database");
          
            return true;
          
        } else {
        	
            return false;
      }
    
    
  
	}




	@Override
	public List<Patients> getAllthePatients() {
		// TODO Auto-generated method stub
		return patientrepository.findAll();
	}
    	
    	
    




}












 
	

