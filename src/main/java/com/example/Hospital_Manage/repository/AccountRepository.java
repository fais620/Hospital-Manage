package com.example.Hospital_Manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hospital_Manage.modelentity.Account;



public interface AccountRepository extends JpaRepository<Account, Integer> {
	
    Account findByEmailAndPassword(String email, String password);
}