package com.damascena.webservice.repositories;

import com.damascena.webservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
