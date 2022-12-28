package com.example.contact;

import org.springframework.data.repository.CrudRepository;

import com.example.contact.entity.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
