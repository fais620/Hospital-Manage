package com.example.Hospital_Manage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Hospital_Manage.Service.DoctorsService;
import com.example.Hospital_Manage.modelentity.Doctor;

@Controller
public class DoctorController{
	
	
	@Autowired
	private DoctorsService servicedoctor;
	
	
	@PostMapping("/Doctor/addDoctor")
	public String addDoctor(@ModelAttribute Doctor doctor) {
		
		servicedoctor.addDoctor(doctor);
		
		return "sucess";
		
	}
	
	
	
	@PostMapping("/DeleteDoctor")
	public String deleteDoctor(@RequestParam("id") String id) {
		
		boolean isDeleted = servicedoctor.deleteDoctorById(id);
		
		if (isDeleted) {
			
			return "sucess";
			
		} else {
			
			return "failure";
		}
		
	}
	
	
	@GetMapping("/searching")
	public String showFormDetails() {
			
		return  "doctorForm";
		
	}
	
	
	@PostMapping("/doctorForm")
	public String getDoctorById(@RequestParam("id") String id,Model model) {
		
		Doctor doctor = servicedoctor.gettingDoctorById(id);
		
		if(doctor == null) {
			
			model.addAttribute("errorMessage","Doctor detail not found");
			
			return "";
			
		 } else {
			
			model.addAttribute("doctor",doctor);
			
			return "doctordetailform";
			
			
		}
		
		
	}
		
		
	@GetMapping("/getallDoctor")
	public String showDoctorDetails() {
		
		return "doctorForms";
		
	 }
	
	
	
	
	
	
	
	
	
	
	
	
}