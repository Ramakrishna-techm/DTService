package com.dt.de.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dt.de.model.CustomerOffer;

public interface CustomerOfferRepository extends JpaRepository<CustomerOffer, Integer>{

	CustomerOffer findBySUPPLIEROFFERID(int supplierId);
}
