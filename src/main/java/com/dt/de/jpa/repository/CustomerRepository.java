package com.dt.de.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dt.de.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String>{

	@Query(value="SELECT * FROM dt_tbl_customer WHERE STATUS = 'A'",nativeQuery = true)
	List<Customer> findCustomerByStatus();
}
	