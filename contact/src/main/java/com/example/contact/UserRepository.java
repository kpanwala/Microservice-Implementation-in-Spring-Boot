package com.example.contact;

import org.springframework.data.repository.CrudRepository;

import com.example.contact.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	
	 
}
