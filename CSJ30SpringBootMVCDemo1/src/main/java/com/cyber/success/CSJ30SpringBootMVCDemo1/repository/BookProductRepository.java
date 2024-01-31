package com.cyber.success.CSJ30SpringBootMVCDemo1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cyber.success.CSJ30SpringBootMVCDemo1.model.BookProduct;

@Repository
public interface BookProductRepository extends CrudRepository<BookProduct, Long>{

}
