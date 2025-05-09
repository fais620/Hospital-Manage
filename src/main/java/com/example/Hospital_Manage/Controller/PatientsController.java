package com.example.Hospital_Manage.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.Hospital_Manage.Service.PatientsServiceLayer;
import com.example.Hospital_Manage.modelentity.Patients;

import jakarta.servlet.http.HttpSession;



@Controller
public class PatientsController {
	
	 
	@Autowired
	private PatientsServiceLayer patientService;
	
	@GetMapping("/AddPatient")
	public String showAddPatientForm() {
	    return "AddPatient";  // This corresponds to the AddPatient.html view
	}

	
	  
	
	@PostMapping("/Patients/addingPatient")
	public String addPatient(@ModelAttribute Patients patient, RedirectAttributes redirectAttributes) {
	    System.out.println("The Patient URL has been called");

	    boolean isAdded = patientService.addPatient(patient);

	    if (isAdded) {
	        redirectAttributes.addFlashAttribute("successMessage", "Patient details added successfully!");
	    } else {
	        redirectAttributes.addFlashAttribute("errorMessage", "Patient details not added successfully.");
	    }

	    return "redirect:/AddPatient";  // Redirect to the same page after processing
	}

    
    
    
  
    
    @PostMapping("/deletePatient")
    public ResponseEntity<String> deletePatientByForm(@RequestParam("id") String id) {
      
    	
        boolean deleted = patientService.deletePatientById(id);
        
        if (deleted) {
        	
            return ResponseEntity.ok("Patient with ID " + id + " deleted successfully from the database.");
            
        } else {
        	
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Patient not found with ID " + id);
        }
    }
    
    
    
    

      @GetMapping("/search-form")
      public String showSearchForm() {

        return "search"; 

    }



    @PostMapping("/search")
    public String getPatientById(@RequestParam("id") String id, Model model) {

        Patients patient = patientService.getPatientsById(id);
        
        if (patient == null) {
        	
            model.addAttribute("errorMessage", "Patient not found!");
            
            return "search";

       } else {
    	   
           model.addAttribute("patient", patient);

          return "details"; 
        
         }
        

     }
    
    
    @GetMapping("/patient-form")
    public String showPatientForm() {
    	
        return "patient_form"; 
        
    }
    

    @PostMapping("/show-patients")
    public String displayPatients(Model model) {
    	
        List<Patients> patients = patientService.getAllthePatients();
        
        model.addAttribute("patients", patients);
        
        return "patient_lists"; 
    }
    
    
   
    
    
    
    

}





