package com.example.contact.service;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.contact.ContactRepository;
import com.example.contact.entity.Contact;

@Service
public class ContactService {
	
	@Autowired
    private ContactRepository contactRepo;
	
	public Iterable<Contact> getAllContacts(){ 
        return contactRepo.findAll();
	}
	
	public Iterable<Contact> getContactsOfUser(String usrId) {
		Iterable<Contact> listContacts = contactRepo.findAll(); 
		return StreamSupport.stream(listContacts.spliterator(), false).filter(Contact -> Contact.getUserId().equals(usrId)).collect(Collectors.toList());
	}
}
