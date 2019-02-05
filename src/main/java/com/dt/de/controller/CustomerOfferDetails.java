package com.dt.de.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dt.de.jpa.repository.CustomerOfferRepository;
import com.dt.de.model.CustomerOffer;

@RestController
@RequestMapping(path="/dtCustomerOffer")
public class CustomerOfferDetails {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	//code change by Ram
	@Autowired
	private CustomerOfferRepository customerOfferRepository; 
	
	@CrossOrigin
	@PostMapping("/createCustomerOffer")
	public CustomerOffer createCustomerOffer(@RequestBody CustomerOffer customerOffer) {
		CustomerOffer customerOfferDetails = new CustomerOffer();
		LOGGER.info("Customer Offer Details : "+customerOffer);
		LOGGER.info("Customer Offer customerOfferDetails : "+customerOffer);
		customerOfferDetails = customerOfferRepository.save(customerOffer);
		return customerOfferDetails;
	}
	
	@GetMapping("/getCustomerOffer/{supplierOfferId}")
	public CustomerOffer getCustomerOffer(@PathVariable("supplierOfferId") int supplierOfferId) {
		CustomerOffer customerOffer = new CustomerOffer();
		customerOffer = customerOfferRepository.findBySUPPLIEROFFERID(supplierOfferId);
		LOGGER.info("customerOffer : "+customerOffer);
		return customerOffer;
		
	}
}
