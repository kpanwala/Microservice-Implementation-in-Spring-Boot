package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.user.UserRepository;
import com.example.user.entity.User;

@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepo;
	
	public Iterable<User> getAllUsers(){ 
		Iterable<User> listUsers = userRepo.findAll();
        return listUsers;
	}
	
	public User getUser(String usrId) {
		return userRepo.findById(usrId).orElse(null);
	}
}
