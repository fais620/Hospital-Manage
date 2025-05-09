package com.example.Hospital_Manage.modelentity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {

    @Id
    private String doctorid;

    @Column
    private String doctorname;
    
    @Column
    private String email;

    @Column
    private String phonenumber;
    
    @Column
    private String specialisation;
    
    
    public Doctor(String doctorid, String doctorname, String email, String phonenumber, String specialisation) {
	
		this.doctorid = doctorid;
		this.doctorname = doctorname;
		this.email = email;
		this.phonenumber = phonenumber;
		this.specialisation = specialisation;
	}
    
    
    public Doctor() {
    	
    }
    
    

    public String getDoctorid() {
		return doctorid;
	}


	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}


	public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
}
