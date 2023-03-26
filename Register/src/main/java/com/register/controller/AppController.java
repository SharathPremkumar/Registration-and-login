package com.register.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.register.model.User;
import com.register.repository.UserRepository;
 
@Controller
public class AppController {
 
    @Autowired
    private UserRepository repo;
     
    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }
    
    @GetMapping("/register")
    public String showSignUpForm(Model model) {
        model.addAttribute("user", new User());
         
        return "signup_form";
    }
    
    @PostMapping("/process_register")
    public String processRegister(User user) {
    	 BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    	    String encodedPassword = passwordEncoder.encode(user.getPassword());
    	    user.setPassword(encodedPassword);
        repo.save(user);
         
        return "register_success";
    }
    
    @GetMapping("/Login")
    public String login(User user) {
    	
    	
    	return "login_page";
    }
    
    @GetMapping("/BackToHome")
    public String backToHome(User user) {
    	
    	
    	return "index";
    }
    
    
    @GetMapping("/users")
    public String viewUserList(Model model) {
    	List<User> listUsers = repo.findAll();
        model.addAttribute("listUsers", listUsers);
    	return "users";
    }
    
}
