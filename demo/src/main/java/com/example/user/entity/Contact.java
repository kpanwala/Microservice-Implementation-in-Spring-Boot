package com.example.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Contact")
public class Contact {

	@Id
    private String id;
	
    private String email;
    private String contactName;
    private String userId;

    public Contact(String id, String email, String contactName, String userId) {
        this.id = id;
        this.email = email;
        this.contactName = contactName;
        this.userId = userId;
    }
    
    public Contact() {}

    public void setUserId(String userId) {
		this.userId = userId;
	}

    public String getId() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

	public String getUserId() {
		return userId;
	}
}