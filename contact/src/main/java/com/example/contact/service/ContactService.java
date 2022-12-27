package com.example.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.contact.entity.Contact;

@Service
public class ContactService {
	
	List<Contact> list = List.of(
            new Contact("101", "amit@gmail.com", "Amit", "1"),
            new Contact("102", "anil@gmail.com", "Anil", "1"),
            new Contact("103", "rohan@gmail.com", "Rohan", "2"),
            new Contact("104", "sameer@gmail.com", "Sameer", "3")
    );
	
	public List<Contact> getAllContacts(){ 
		return list;
	}
	
	public List<Contact> getContactsOfUser(String usrId) {
		return list.stream().filter(Contact -> Contact.getUserId().equals(usrId)).collect(Collectors.toList());
	}
}
