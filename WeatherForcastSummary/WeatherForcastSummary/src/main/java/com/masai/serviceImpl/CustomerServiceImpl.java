package com.masai.serviceImpl;

import com.masai.exception.CustomerAlreadyExistsException;
import com.masai.model.Customer;
import com.masai.repository.CustomerRepository;
import com.masai.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer registerAdmin(Customer customer) {
		Customer existingAdminOptional = customerRepository.findByEmail(customer.getEmail());

	       if (existingAdminOptional!=null) {
	           throw new CustomerAlreadyExistsException("Customer already exists with this email: " + customer.getEmail());
	       }

	      
	       return customerRepository.save(customer);
	}

}
