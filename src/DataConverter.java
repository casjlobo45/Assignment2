
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
		s.nextLine();
		//Read in and process the data file, create customers and add them to the array
		//Reading in the customer file
		int i = 0;
		while(s.hasNext()){
			//Store the next line in a string
			String line = s.nextLine();
			//split the string with the delimiter ";" into a string array
			String[] tokens = line.split(";");
			//The string is now split along the delimiter
			String customerCode = tokens[0];
			String type = tokens[1];
			String primaryContact = tokens[2];
			String name = tokens[3];
			//Split the address along the delimiter and create a new address object
			String[] address = tokens[4].split(",");
			Address customerAddress = new Address(address[0], address[1], address[2], address[3], address[4]);
			Customer newCustomer = new Customer(customerCode, type, primaryContact, name, customerAddress);
			Customers[i] = newCustomer;
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
				writer.write(csout+"\n");
			} catch (IOException e) {
				e.printStackTrace();;
			}
	
			} try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//New scanner that reads in the Persons data file
		fileName = "data/Persons.dat";
		Scanner t = null;
		try {
			t = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Create a new Persons array--the size is the first line which has the number of records in the file
		Persons Persons[] = new Persons[t.nextInt()];
		t.nextLine();
		//Read in and process the data file, create persons and add them to the array
		//Reading in the customer file
		i = 0;
		while(t.hasNext()){
			//Store the next line in a string
			String line = t.nextLine();
			//split the string with the delimiter ";" into a string array
			String[] tokens = line.split(";");
			//The string is now split along the delimiter
			String personCode = tokens[0];
			String[] personName = tokens[1].split(",");
			Name name = new Name(personName[1], personName[0]);
			//Split the address along the delimiter and create a new address object
			String[] address = tokens[2].split(",");
			Address personAddress = new Address(address[0], address[1], address[2], address[3], address[4]);
			//*******************Error*************************************//
			//*****************There can be 0 e-mails, 1 or more*************//
			String[] email = null;
			if(tokens.length > 3){
				email = tokens[3].split(",");
			}
			Persons newPerson = new Persons(personCode, name, personAddress, email);
			Persons[i] = newPerson;
			i++;
		}		
		
		//Converting array to xml file
		File xmlOut2 = new File("data/Persons.xml");

		FileWriter writer2 = null;
		XStream xstream2 = new XStream();

		try { 
			writer2 = new FileWriter(xmlOut2); 
		} 
		catch (IOException e) { 
			e.printStackTrace();

		}

		//For loop that goes through the array of persons converting it to xml
		for(Persons p : Persons) { 
			String pOut = xstream.toXML(p);

			try {
				writer2.write(pOut+"\n");
			} catch (IOException e) {
				e.printStackTrace();;
			}
			
			} try {
				writer2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

			//New scanner that reads in the Product data file
			fileName = "data/Products.dat";
			Scanner p = null;
			try {
				p = new Scanner(new File(fileName));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			//Create a new Product array--the size is the first line which has the number of records in the file
			Product ProductArray[] = new Product[p.nextInt()];
			p.nextLine();
			//Read in and process the data file, create product object and add them to the array
			//Reading in the customer file
			i = 0;
			while(p.hasNext()){
				//Store the next line in a string
				String line = p.nextLine();
				//split the string with the delimiter ";" into a string array
				String[] tokens = line.split(";");
				//The string is now split along the delimiter
				String productCode = tokens[0];
				String productType = tokens[1];
				if(productType.equals("TG")){//game ticket
					String venueCode = tokens[2];
					
					String dateTime = tokens[3];
					String team1 = tokens[4];
					String team2 = tokens[5];
					double pricePerUnit = Double.parseDouble(tokens[6]);
	////////Venues venue = new Venues(venueCode, unl.cse.project.Venues.getName(), unl.cse.project.Venues.getAddress(), unl.cse.project.Venues.getCapacity());
					//Product newProduct = new GameTicket(productCode, productType, venue, dateTime, team1, team2, pricePerUnit);
					//ProductArray[i] = newProduct;

				}
				else if(productType.equals("TS")){//season pass
					String team = tokens[2];
					String startDate = tokens[3];
					String endDate = tokens[4];
					double cost = Double.parseDouble(tokens[5]);
					Product newProduct = new SeasonPass(productCode, productType, team, startDate, endDate, cost);
					ProductArray[i] = newProduct;

				}
				else if(productType.equals("SP")){//parking pass
					String venueCode = tokens[2];
					double hourlyFee = Double.parseDouble(tokens[3]);
					//Venues venue = new Venues(venueCode, unl.cse.project.Venues.getName(), unl.cse.project.Venues.getAddress(), unl.cse.project.Venues.getCapacity());
					//Product newProduct = new ParkingPass(productCode, productType, venue, hourlyFee);
					//ProductArray[i] = newProduct;
				}
				else if(productType.equals("SL")){//psl
					String ticketCode = tokens[2];
					double licenseFee = Double.parseDouble(tokens[3]);
					Product newProduct = new PSL(productCode, productType, licenseFee, ticketCode);
					ProductArray[i] = newProduct;

				}
				else if(productType.equals("SR")){//refreshment
					String name = tokens[2];
					double cost = Double.parseDouble(tokens[3]);
					Product newProduct = new Refreshments(productCode, productType, name, cost);
					ProductArray[i] = newProduct;
				}
				i++;
			}		
			
			//Converting array to xml file
			File xmlOut3 = new File("data/Products.xml");

			FileWriter writer3 = null;
			XStream xstream3 = new XStream();

			try { 
				writer3 = new FileWriter(xmlOut3); 
			} 
			catch (IOException e) { 
				e.printStackTrace();

			}

			//For loop that goes through the array of persons converting it to xml
			for(Product product1 : ProductArray) { 
				String productOut = xstream.toXML(product1);

				try {
					writer3.write(productOut+"\n");
				} catch (IOException e) {
					e.printStackTrace();;
				}
				
				} try {
					writer3.close();
				} catch (IOException e) {
					e.printStackTrace();
				}	
		
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
				
				
				//Create a scanner to read in the file
				fileName = "data/Venues.dat";
				Scanner q = null;
				
				try {
					q = new Scanner(new File(fileName));
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				
				//Create a new customer array---the size is the first line which has the number of records in the file
				Venues Venues[] = new Venues[q.nextInt()];
				q.nextLine();
				//Read in and process the data file, create customers and add them to the array
				//Reading in the customer file
				i = 0;
				while(q.hasNext()){
					//Store the next line in a string
					String line = q.nextLine();
					//split the string with the delimiter ";" into a string array
					String[] tokens = line.split(";");
					//The string is now split along the delimiter
					String venueCode = tokens[0];
					String name = tokens[1];
					//Split the address along the delimiter and create a new address object
					String[] address = tokens[2].split(",");
					Address venueAddress = new Address(address[0], address[1], address[2], address[3], address[4]);
					String capacity = tokens[3];
					Venues newVenue = new Venues(venueCode, name, venueAddress, capacity);
					Venues[i] = newVenue;
					i++;
				}
				
				
				//Converting array to xml file
				File xmlOut4 = new File("data/Venues.xml");

				FileWriter writer4 = null;

				XStream xstream4 = new XStream();

				try { 
					writer4 = new FileWriter(xmlOut4); 
				} 
				catch (IOException e) { 
					e.printStackTrace();

				}

				//For loop that goes through the array of customers converting it to xml
				for(Venues vs : Venues) { 
					String vsout = xstream.toXML(vs);

					try {
						writer4.write(vsout+"\n");
					} catch (IOException e) {
						e.printStackTrace();;
					}
			
					} try {
						writer4.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			
			
		}	

}
