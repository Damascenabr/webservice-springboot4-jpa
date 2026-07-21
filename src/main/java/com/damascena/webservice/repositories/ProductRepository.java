package com.damascena.webservice.repositories;

import com.damascena.webservice.entities.Product;
import com.damascena.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
