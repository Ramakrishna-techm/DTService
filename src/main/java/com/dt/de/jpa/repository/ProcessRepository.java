package com.dt.de.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dt.de.model.Process;

@Repository
public interface ProcessRepository extends JpaRepository<Process, Integer>{
	
	@Transactional
	@Query	(value="SELECT dt_tbl_create_process.*, dt_tbl_customer.CUSTOMERNAME, dt_tbl_customer.ALTERNATENAME  FROM dt_tbl_create_process \r\n" + 
					"INNER JOIN dt_tbl_customer \r\n" + 
						"ON dt_tbl_customer.CUSTOMERID = dt_tbl_create_process.CUSTOMERID\r\n" + 
							"WHERE dt_tbl_create_process.PROCESSSTATUS = 'O'"
							+ "AND dt_tbl_create_process.STAFFID = ?1",
									nativeQuery = true
			)
	List<Process> fetchOpenAndActiveProcess(String staffid);
	
	List<Process> findBySTAFFID(String userId);

} 
