package com.example.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.user.entity.User;

@Service
public class UserService {
	
	List <User> list = List.of(
			new User("1","Kalp"),
			new User("2","Aakash"),
			new User("3","Fenil"));
	
	public List<User> getAllUsers(){ 
		return list;
	}
	
	public User getUser(String usrId) {
		return list.stream().filter(user -> user.getId().equals(usrId)).findAny().orElse(null);
	}
}
