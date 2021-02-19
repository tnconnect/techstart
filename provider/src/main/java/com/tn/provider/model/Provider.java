package com.tn.provider.model;

public class Provider {
	
	private String firstName;
	private String lastName;
	private String country;
	private String state;
	
	@Override
	public String toString() {
		return "Provider [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country + ", state="
				+ state + "]";
	}
	public Provider(String firstName, String lastName, String country, String state) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.state = state;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
