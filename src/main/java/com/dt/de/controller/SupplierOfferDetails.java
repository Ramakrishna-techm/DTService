package com.dt.de.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dt.de.jpa.repository.SupplierOfferRepository;
import com.dt.de.model.SupplierOffer;



@RestController
@RequestMapping(path="/dtSupplierOffer")
@CrossOrigin
public class SupplierOfferDetails {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private SupplierOfferRepository supplierOfferRespository;
	
	@GetMapping(value= "/getSupplierOfferDetails")
	public List<SupplierOffer> getSupplierOfferDetails(@RequestParam("processId") int processId){
		LOGGER.info("Process ID : "+ processId);
		List<SupplierOffer> supplierOfferList = new ArrayList<SupplierOffer>();
		supplierOfferList = supplierOfferRespository.findByPROCESSID(processId);
		return supplierOfferList;
	}

}
