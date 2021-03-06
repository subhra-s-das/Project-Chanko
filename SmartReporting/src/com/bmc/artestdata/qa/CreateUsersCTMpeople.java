package com.bmc.artestdata.qa;

/*
Author: Subhra S. Das
*/

/*
 * include ar api jar and log4j jar in build path
 */
import com.bmc.arsys.api.ARException;
import com.bmc.arsys.api.ARServerUser;
//import com.bmc.arsys.api.Entry;
import com.bmc.arsys.api.Entry;
import com.bmc.arsys.api.Value;

public class CreateUsersCTMpeople {

	// private static ARServerUser arserver;

	public static void main(String[] args) {

		// AR server connection method
		ARconnectionClass connection = new ARconnectionClass("Demo", "bmcAdm1n", "en", "vl-pun-atm-qa12", 0);
		ARServerUser user = connection.arConnection();

		System.out.println("Connecting to AR Server" + user.getServer());

		try {
			user.verifyUser();

		}

		catch (ARException e) {
			String message = e.getMessage();
			System.out.println(message);
		}

		String UserName = "REPO-USR";
		String RemedyPassword = "passowrd";

		// Random random = new Random();
		Entry entry = new Entry(); // creating Object of Entry class
		for (int i = 0; i <= 1; i++)

		{

			entry.put(1000000019, new Value(UserName + i)); // firstName
			entry.put(1000000018, new Value("Automation")); // LastName
			entry.put(1000000022, new Value("2000")); // ClientType
			entry.put(1000000001, new Value("Invention, Inc.")); // Company
			 
			/* optional parameters
			entry.put(1, new Value("STE000000003427"));
			entry.put(200000012, new Value("APAC")); // Region
			entry.put(200000007, new Value("INDIA")); // Site group
			 */			
			entry.put(1000000056, new Value("0123456789")); // PhoneNumber
			entry.put(4, new Value(UserName + i)); // login
			entry.put(1000000048, new Value(UserName + i + "@Invention.co.in")); // Email
			entry.put(1000005507, new Value(RemedyPassword));
			entry.put(109, new Value("1"));

			//
			try {
				user.createEntry("CTM:People", entry);
			} catch (ARException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(entry);
		}

	}

}
