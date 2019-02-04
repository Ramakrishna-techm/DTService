package com.dt.de.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dt.de.model.SupplierOffer;

public interface SupplierOfferRepository extends JpaRepository<SupplierOffer, Integer>{
	
	@Query(value = "SELECT * FROM DT_TBL_SUPPLIER_OFFER SO INNER JOIN DT_TBL_SUPPLIER_MASTER SM ON SO.SUPPLIERID = SM.SUPPLIERID WHERE SO.PROCESSID=?1", nativeQuery = true)
	List<SupplierOffer> findByPROCESSID(int processId);
	
}
