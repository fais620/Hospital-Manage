package com.example.Hospital_Manage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.Hospital_Manage.Service.AppointService;
import com.example.Hospital_Manage.Service.DoctorsService;
import com.example.Hospital_Manage.Service.PatientsServiceLayer;
import com.example.Hospital_Manage.modelentity.Appointment;
import com.example.Hospital_Manage.modelentity.Doctor;
import com.example.Hospital_Manage.modelentity.Patients;
import com.example.Hospital_Manage.repository.DoctorRepository;
import com.example.Hospital_Manage.repository.PatientsRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class AppointmentController {
	
    @Autowired
    private AppointService appointService;
    
    @Autowired
    private DoctorRepository doctorRepository;
    
    @Autowired
    private PatientsRepository patientrepository;
    
    @GetMapping("/bookAppointment")
    public String showBookForm(Model model) {
    	model.addAttribute("appointment",new Appointment());
    	model.addAttribute("doctors",doctorRepository.findAll());
    	model.addAttribute("patients",patientrepository.findAll());
    	
		return "bookAppointment";
    	
    }
    
    @PostMapping("/bookAppointment")
    public String bookAppointment(@ModelAttribute Appointment appointment, HttpSession session) {
        try {
            
            boolean isBooked = appointService.bookAppointment(appointment); 

            if (isBooked) {
              
                session.setAttribute("success", "Appointment booked successfully!");
                
            } else {
             
                session.setAttribute("error", "Failed to book the appointment. Please try again.");
            }
        } catch (Exception e) {
           
            session.setAttribute("error", "An error occurred: " + e.getMessage());
        }

        return "redirect:/bookAppointment"; 
    }

    
    
    
    
/*   public  ResponseEntity<String> addAppoinment(@ModelAttribute Appointment appoinment) {
    	
    	boolean isadded  = appointService.addAppointmentDetails(appoinment);
    	
    	if(isadded) {
    		
    		return ResponseEntity.ok("Appointment is sucessfully done");
    		
    	} else {
    		
    		return ResponseEntity.ok("Appointment not sucessfully done");
    		
    	} */
    	
    	
    	
    	
    	

		
    	
    }
    
    
    
    
  
	
	
	


	
		

	
	


