package com.example.user.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "User")
public class User {
	
	@Id
	private String id;
	private String name;
	
	@Transient
	private List <Contact> contacts;
	
	public User(String id, String name, List<Contact> contacts) {
		super();
		this.id = id;
		this.name = name;
		this.contacts = contacts;
	}
	
	public User() {
		super();
	}
	
	public User(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
