package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.model.Customer;
import com.cognizant.repository.CustomerRepository;


@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	public void createCustomer(Customer customer) {
	customerRepository.save(customer);
	}

	public List<Customer> getAllCustomer() {
		List<Customer> customers = new ArrayList<Customer>();
		customerRepository.findAll().forEach(customer -> customers.add(customer));
		return customers;
		}

	public Customer getCustomerById(int id) {
		return customerRepository.findById(id).get();
		}
	

	
}