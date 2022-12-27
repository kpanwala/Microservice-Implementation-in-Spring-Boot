package com.example.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.user.entity.User;
import com.example.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@Autowired
    private RestTemplate restTemplate;
	
//	@GetMapping("/users")
//	public List <User> getUsers(){
//		return this.userService.getAllUsers();
//	}
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") String usrId){
		
		User user = this.userService.getUser(usrId);
        //http://localhost:9002/contact/user/1311

        List contacts = this.restTemplate.getForObject("http://contact-service/contact/user/" + user.getId(), List.class);
        user.setContacts(contacts);
        
        return user;
	}
	
}
