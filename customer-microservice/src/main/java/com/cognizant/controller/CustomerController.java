package com.cognizant.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.model.Customer;
import com.cognizant.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/customer")
	private List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}

	@GetMapping("/customer/{id}")
	private Customer getCustomer(@PathVariable("id") int id) {
		return customerService.getCustomerById(id);
	}

	
	
	@PostMapping("/customer")
	private int createCustomer(@RequestBody Customer customer) {
		customerService.createCustomer(customer);
		return customer.getId();
	}
}
