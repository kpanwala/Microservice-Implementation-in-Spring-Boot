package com.example.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.contact.entity.Contact;
import com.example.contact.service.ContactService;


@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;
    
    @GetMapping("/all")
    public Iterable<Contact> listAll() {
        return this.contactService.getAllContacts();
    }
    

    @GetMapping("/user/{userId}")
    public Iterable<Contact> getContacts(@PathVariable("userId") String userId) {
        return this.contactService.getContactsOfUser(userId);
    }

}
