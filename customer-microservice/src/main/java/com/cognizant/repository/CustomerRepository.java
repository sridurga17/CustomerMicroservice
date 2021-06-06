package com.cognizant.repository;

import org.springframework.data.repository.CrudRepository;
import com.cognizant.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
}
