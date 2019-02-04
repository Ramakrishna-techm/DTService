package com.dt.de.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dt.de.jpa.repository.CustomerRepository;
import com.dt.de.model.Customer;

@RestController
@RequestMapping(path = "/dtCustomer")
@CrossOrigin
public class CustomerDetails { 
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CustomerRepository customRepository;

	@GetMapping(path="/fetchCustomers")
	public @ResponseBody List<Customer> getCustomers() {
			return customRepository.findCustomerByStatus();
	}
}
