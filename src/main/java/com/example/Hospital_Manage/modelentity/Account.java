package com.example.Hospital_Manage.modelentity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



import jakarta.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;

    private String password;

    @Column(name = "phone_number")  
    private String phoneNo;

 
    public Account() {
    	
    }

   
    public Account(String name, String email, String password, String phoneNo) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNo = phoneNo;
        
    }

   
    public int getId() {
        return id;
        
    }

    public void setId(int id) {
        this.id = id;
        
    }

    public String getName() {
        return name;
        
    }

    public void setName(String name) {
        this.name = name;
        
    }

    public String getEmail() {
        return email;
        
    }

    public void setEmail(String email) {
        this.email = email;
        
    }

    public String getPassword() {
        return password;
        
    }

    public void setPassword(String password) {
        this.password = password;
        
    }

    public String getPhoneNo() {
        return phoneNo;
        
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
        
    }
}
