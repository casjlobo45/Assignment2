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
	private Name name;
	private Address address;
	private String[] email;
	
	//Constructor for Persons
	public Persons(String personCode, Name name, Address address, String[] email){
		this.personCode = personCode;
		this.name = name;
		this.address = address;
		this.email = email;	
	}
	
	
	//Getters and Setters:
	public String getPersonCode() {
		return personCode;
	}

	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}

	public Name getString() {
		return name;
	}

	public void setString(Name name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String[] email) {
		this.email = email;
	}

	
	
	
	
	
}
