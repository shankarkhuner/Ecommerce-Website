package com.cyber.success.CSJ30SpringBootMVCDemo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cyber.success.CSJ30SpringBootMVCDemo1.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	@Transactional
	@Modifying
	@Query(value ="UPDATE Product p set p.productPrice=:price,p.productName=:pname where p.productId=:pid")
	public int updateMyProduct(@Param("pid")  long productId, @Param("price")   double price, @Param("pname")   String name);

	
	
	
	@Transactional
	@Modifying
	@Query(value ="delete from Product p where p.productId=:pid")
	public int deleteMyProduct(@Param("pid")  long productId);

	
	
}
