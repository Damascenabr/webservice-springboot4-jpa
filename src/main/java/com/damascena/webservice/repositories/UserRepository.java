package com.damascena.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.damascena.webservice.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	

}
