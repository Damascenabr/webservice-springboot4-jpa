package com.damascena.webservice.repositories;

import com.damascena.webservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
