
/*
 * VenuesClass
 * CSCE 156
 * Assignment 2-6
 * Austin Baade
 * Carlos Sandoval
 * 
 * 
 * This class is the constructor for the venues object.
 */


public class Venues {
	//Variables for Venues:
	private String venueCode;
	private String name;
	private Address address;
	private String capacity;
	
	//Constructor for Venues:
	public Venues(String venueCode, String name, Address address, String capacity){
		this.venueCode = venueCode;
		this.name = name;
		this.address = address;
		this.capacity = capacity;
	}


	
	//Getters and Setters:
	public String getVenueCode() {
		return venueCode;
	}


	public void setVenueCode(String venueCode) {
		this.venueCode = venueCode;
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


	public String getCapacity() {
		return capacity;
	}


	public void setCapactiy(String capacity) {
		this.capacity = capacity;
	}
	
	
	
	
	
	
}
