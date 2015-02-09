
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
	private String address;
	private int capactiy;
	
	//Constructor for Venues:
	public Venues(String venueCode, String name, String address, int capacity){
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getCapactiy() {
		return capactiy;
	}


	public void setCapactiy(int capactiy) {
		this.capactiy = capactiy;
	}
	
	
}
