package com.dt.de.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dt.de.model.Supplier;

@Repository
public interface SupplierRepository  extends JpaRepository<Supplier,Integer>{

	List<Supplier>  findAll();
	Supplier findBySUPPLIERID (int SUPPLIERID);
	
	@Query(value="SELECT * FROM DT_TBL_SUPPLIER_MASTER SM INNER JOIN DT_TBL_PRODUCT_MASTER PM ON SM.PRODUCTID = PM.PRODUCTID WHERE PM.PRODUCTNAME=?1", nativeQuery = true)
	List<Supplier> findByPRODUCTNAME(String productName);
}
