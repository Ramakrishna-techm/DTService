package com.dt.de.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dt.de.model.Supplier;
import com.dt.de.jpa.repository.SupplierRepository;

@RestController
@RequestMapping(path="/dtSupplier")
@CrossOrigin
public class SupplierController {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	SupplierRepository supplierRepository;

	@GetMapping(value = "/getSupplier/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Supplier getSupplierById(@PathVariable("id") int SUPPLIERID) {
		System.out.println("Fetching User with SUPPLIERID " + SUPPLIERID);
		//Supplier supplier = suplierRepository.findBySUPPLIERID(SUPPLIERID);
		Optional<Supplier> supplier = supplierRepository.findById(SUPPLIERID);
		return supplier.get();
	}

	@GetMapping(value= "/getSupplierDetails")
	public List<Supplier> getSupplierOfferDetails(@RequestParam("productName") String productName){
		System.out.println("productName : "+ productName);
		List<Supplier> supplierOfferList = new ArrayList<Supplier>();
		supplierOfferList = supplierRepository.findByPRODUCTNAME(productName); 
		return supplierOfferList;
	}
	
	@GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Supplier> getSupplier() {
		System.out.println("Entered controller : getSuppliers()");
		List<Supplier> supplier = supplierRepository.findAll();
		return supplier;
	}

/*	@GetMapping(value = "/getSuppliers", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Supplier> fetchSupplierInnerJoin() {
		List<Supplier> supplier = suplierRepository.fetchSupplierInnerJoin();
		return supplier;
	}*/

}