package com.example.Hospital_Manage.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.Hospital_Manage.modelentity.Account;
import com.example.Hospital_Manage.repository.AccountRepository;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/login")
    public String showLoginPage() {
    	
    	System.out.println("Get Mapping login controller is basically hitted");
    	
        return "login";  
    }


    @PostMapping("/login")
    public String loginAccount(@RequestParam("email") String email, @RequestParam("password") String password,RedirectAttributes redirectAttributes,HttpSession session) {
    	
        System.out.println("The PostMapping login Controller is basically hit");
        
        Account account = accountRepository.findByEmailAndPassword(email, password);

        if (account != null) {
          
            session.setAttribute("userName", account.getName());

            redirectAttributes.addFlashAttribute("message", "Welcome " + account.getName() + "!");
            
            return "redirect:/dashboard";
            
        } else {
        	
            redirectAttributes.addFlashAttribute("error", "Invalid email or password");
            
            return "redirect:/login";
        }
    }
    
    @GetMapping("/dashboard")
    public String showDashboard() {
    	
    	System.out.println("The dashboard controller is basically called");
    	
        return "dashboard"; 
    }
}
