package com.example.user.entity;

import java.util.List;

public class User {
	private String id;
	private String name;
	private List <Contact> contacts;
	
	public User(String id, String name, List<Contact> contacts) {
		super();
		this.id = id;
		this.name = name;
		this.contacts = contacts;
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
