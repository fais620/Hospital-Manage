package com.example.Hospital_Manage.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital_Manage.modelentity.Account;
import com.example.Hospital_Manage.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account login(String email, String password) {
    	System.out.println("The account repository layer is basically called");
        return accountRepository.findByEmailAndPassword(email, password);
    }
}