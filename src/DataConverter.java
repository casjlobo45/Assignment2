
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.thoughtworks.xstream.*;

	
/*
 * Main Program
 * CSCE 156
 * Assignment 2-6
 * Austin Baade
 * Carlos Sandoval
 * 
 * 
 * This Program reads in flat files, creates instances of objects, and then outputs them to XML files.
 */




public class DataConverter {
	public static void main(String[] args) {
		
		
		//Create a scanner to read in the file
		String fileName = "data/Customers.dat";
		Scanner s = null;
		
		try {
			s = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		//Create a new customer array---the size is the first line which has the number of records in the file
		Customer Customers[] = new Customer[s.nextInt()];

		//Read in and process the data file, create customers and add them to the array
		//Reading in the customer file
		int i = 0;
		while(s.hasNext()){
			//Store the next line in a string
			String line = s.nextLine();
			//split the string with the delimiter ";" into a string array
			String tokens[] = line.split(";");
			//The string is now split along the delimiter
			String customerCode = tokens[0];
			String type = tokens[1];
			String primaryContact = tokens[2];
			String name[] = tokens[3].split(",");
			Name customerName = new Name(name[1], name[0]);
			String address[] = tokens[4].split(",");
			Address customerAddress = new Address(address[0], address[1], address[2], address[3], address[4]);
			Customer t = new Customer(customerCode, type, primaryContact, customerName, customerAddress);
			Customers[i] = t;
			i++;
		}
		

		//Converting array to xml file
		File xmlOut = new File("data/Customers.xml");

		FileWriter writer = null;

		XStream xstream = new XStream();

		try { 
			writer = new FileWriter(xmlOut); 
		} 
		catch (IOException e) { 
			e.printStackTrace();

		}

		//For loop that goes through the array of customers converting it to xml
		for(Customer cs : Customers) { 
			String csout = xstream.toXML(cs);

			try {
				writer.write(cs+"\n");
			} catch (IOException e) {
				e.printStackTrace();;
			}
	
			} try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}

}
