/*
 * Persons Class
 * CSCE 156
 * Assignment 2-6
 * Austin Baade
 * Carlos Sandoval
 * 
 * 
 * This class is the constructor for the person object.
 */



public class Persons {
	private String personCode;
	private String name;
	private Address address;
	private String emailAddress;
	
	//Constructor for Persons
	public Persons(String personCode, String name, Address address, String emailAdress){
		this.personCode = personCode;
		this.name = name;
		this.address = address;
		this.emailAddress = emailAddress;	
	}
	
	
	//Getters and Setters:
	public String getPersonCode() {
		return personCode;
	}

	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}

	public String getString() {
		return name;
	}

	public void setString(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	
	
	
	
	
}
