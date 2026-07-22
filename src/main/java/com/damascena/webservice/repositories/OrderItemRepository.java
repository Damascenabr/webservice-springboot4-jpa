package com.damascena.webservice.repositories;

import com.damascena.webservice.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	

}
