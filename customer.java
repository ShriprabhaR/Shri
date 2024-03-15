package com.tnsif.customer1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class customer
{
	private int customerId;
	private String name;
	private String email;
	private String phoneNumber;
	private String address;
	

	public customer() 
	{
		super();
	}
	
	
	public customer(int customerId, String name, String email, String phoneNumber, String address) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	@Id

	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", name=" + name + ", email=" + email + ", phoneNumber="
				+ phoneNumber + ", address=" + address + ", getCustomerId()=" + getCustomerId() + ", getName()="
				+ getName() + ", getEmail()=" + getEmail() + ", getPhoneNumber()=" + getPhoneNumber()
				+ ", getAddress()=" + getAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
