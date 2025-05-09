package com.example.Hospital_Manage.Service;

import com.example.Hospital_Manage.modelentity.Account;

public interface AccountService {
	
    Account login(String email, String password);
}