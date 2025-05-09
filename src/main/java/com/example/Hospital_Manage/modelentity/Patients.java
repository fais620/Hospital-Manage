package com.example.Hospital_Manage.modelentity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Patients {
	
	@Id
	@Column
	private String patientId;
	
	@Column
	private String patientName;
	
	@Column
	private int patientAge;
	
	@Column
	private String patientGender;
	
	@Column
	private String patientPhoneNum;
	
	@Column
	private String patientEmail;
	
	@Column
	private String patientAddress;
	
	
	public Patients(String patientId, String patientName, int patientAge, String patientGender, String patientPhoneNum, String patientEmail, String patientAddress) {
		 	
	    this.patientId = patientId;
	    this.patientName = patientName;
	    this.patientAge = patientAge;
	    this.patientGender = patientGender;
	    this.patientPhoneNum = patientPhoneNum;
	    this.patientEmail = patientEmail;
	    this.patientAddress = patientAddress;
		
	}
	
	public Patients () { 
		
	}

	public String getPatientId() {
		
		return patientId;
		
	}

	public void setPatientId(String patientId) {
		
		this.patientId = patientId;
		
	}

	public String getPatientName() {
		
		return patientName;
		
	}

	public void setPatientName(String patientName) {
		
		this.patientName = patientName;
		
	}

	public int getPatientAge() {
		
		return patientAge;
		
	}

	public void setPatientAge(int patientAge) {
		
		this.patientAge = patientAge;
		
	}

	public String getPatientGender() {
		
		return patientGender;
		
	}

	public void setPatientGender(String patientGender) {
		
		this.patientGender = patientGender;
		
	}


	public String getPatientPhoneNum() {
		
		return patientPhoneNum;
	}

	public void setPatientPhoneNum(String patientPhoneNum) {
		
		this.patientPhoneNum = patientPhoneNum;
	}
	

	public String getPatientEmail() {
		
		return patientEmail;
		
	}

	public void setPatientEmail(String patientEmail) {
		
		this.patientEmail = patientEmail;
	}

	public String getPatientAddress() {
		
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		
		this.patientAddress = patientAddress;
		
	}
	//<form onsubmit="return validateForm()">
	
	
	

	
    
    

		
}

