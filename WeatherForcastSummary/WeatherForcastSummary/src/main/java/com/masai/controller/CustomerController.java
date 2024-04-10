package com.masai.controller;

import com.masai.model.Customer;
import com.masai.repository.CustomerRepository;
import com.masai.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;




@RequestMapping("/customer")
@RestController
public class CustomerController {

	@Autowired
    private CustomerService customerService;
    
    @Autowired
    private CustomerRepository customerRepository;
    
    @Autowired
	private PasswordEncoder PasswordEncoder;
    
    @PostMapping("/register")
    public ResponseEntity<Customer> registerAdmin(@RequestBody Customer customer) {
    	customer.setPassword( PasswordEncoder.encode(customer.getPassword()));
    	Customer registeredAdmin = customerService.registerAdmin(customer);
        return new ResponseEntity<>(registeredAdmin, HttpStatus.CREATED);
    }


    
    
    @GetMapping("/logini")
	public ResponseEntity<String> logInUserHandler(Authentication auth){
    	Customer opt= customerRepository.findByEmail(auth.getName());
		 if(opt==null) throw new RuntimeException("No user found") ;
		 Customer user = opt;
		 return new ResponseEntity<>(user.getUsername()+" Logged In Successfully", HttpStatus.ACCEPTED);
	}       
	
	

}
