package com.example.contact.entity;

public class Contact {

    private String cId;
    private String email;
    private String contactName;
    private String userId;

    public Contact(String cId, String email, String contactName, String userId) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        this.userId = userId;
    }

    public void setUserId(String userId) {
		this.userId = userId;
	}

	public Contact() {


    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
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