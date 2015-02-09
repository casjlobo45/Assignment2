
/*
 * Name Class
 * CSCE 156
 * Assignment 2-6
 * Austin Baade
 * Carlos Sandoval
 * 
 * 
 * This class is the constructor for the name object.
 */

public class Name {
	 private String fName;
	 private String lName;
	 
	 
	 //constructor
	 public Name(String fName, String lName){
	 this.fName = fName;
	 this.lName = lName;
	 }
	 
	 
	 /*
		String parts[] = name.split(",");
		Name Name = new Name(parts[0], parts[1]);
	*/	
	 
	 
	 //getters/setter methods
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
}
