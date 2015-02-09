
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.thoughtworks.xstream.*;

	public class Customer {
	
	public static void main(String[] args) {
		String fileName = "data/Customers.dat";
		Scanner s = null;
		
		try {
			s = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		CustomerStruct Customers[] = new CustomerStruct[s.nextInt()];

		//TODO: read in and process the data file, create teams and add them to the array
		int i = 0;
		s.useDelimiter(";");
		while(s.hasNext()){
			s.nextLine();
			CustomerStruct t = new CustomerStruct(s.next(), s.next(), s.next(), s.next(), s.next());
			Customers[i] = t;
			i++;
		}
		
		File xmlOut = new File("data/Customers.xml");

		FileWriter writer = null;

		XStream xstream = new XStream();

		try { writer = new FileWriter(xmlOut); } catch (IOException e) { e.printStackTrace();

		}

		for(CustomerStruct cs : Customers) { String csout = xstream.toXML(cs);

		try {
			writer.write(cs+"\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();;
		}

		} try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
