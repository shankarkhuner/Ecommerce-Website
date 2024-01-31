package com.cyber.success.CSJ30SpringBootMVCDemo1.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cyber.success.CSJ30SpringBootMVCDemo1.model.Customer;

@Repository
public interface CustomerRespository extends CrudRepository<Customer, Long> {
	/*
	 * EntityManager em
	 * Query q=em.createQuery(string sql query)
	 * q.setParamter("a",100);
	 * 
	 * 
	 * 
	 */
	//to write sql query
	//@Query(value="select * from Customer",nativeQuery = true)
	@Query("select c from Customer c where c.userName=:un and c.userPassword=:pw")
	public Customer doLogin(@Param ("un") String userName,
			@Param("pw") String password);
			
	
	

}
