package com.bmc.artestdata.qa;

import com.bmc.arsys.api.*;

public class DoNotUse 
{
	// instance variables
      public static ARServerUser server;
      public static String formName= "User";
      String IntEntryID = "";
      String inciID = "";

      //constructor
public DoNotUse() 
{
	server = new ARServerUser();
	server.setServer("clm-pun-011027");
	server.setUser("Demoonbmc");
	server.setPassword("onbmc");
	server.setPort(46262);

}


      public static void main(String[] args) throws ARException 
      {
            DoNotUse test = new DoNotUse();

// Call Function for Login
            test.connect();
//          test.cleanup();
//          System.exit(0);
            Entry entry = new Entry();
            for (int i=1;i<=6;i++) {

                  String str = "ReportingUser"+i;
                  entry.put(Constants.AR_CORE_SHORT_DESCRIPTION, new Value(str));
                  entry.put(Constants.AR_RESERV_USER_NAME, new Value(str));
                  entry.put(Constants.AR_RESERV_PASSWORD, new Value(str));
                  entry.put(Constants.AR_RESERV_GROUP_LIST, new Value("20029;20028;20024;20023;1;"));
                  entry.put(Constants.AR_RESERV_LICENSE_TYPE, new Value(Constants.AR_LICENSE_TYPE_FIXED));
                  try {
                        server.createEntry(formName, entry);
                        
                        System.out.println(str);
                  } catch(ARException arException) {

                        System.out.println("Did not throw proper error code on creating identical users");

                  }
            }
            test.cleanup();
      }

      
// Connect the current user to the server.
      public void connect() throws ARException 
      {
            System.out.println("Connecting to AR Server '" +server.getServer()+ "'...");
            server.verifyUser();
            System.out.println("User '" +server.getUser()+ "' Connected to AR Server '" +server.getServer()+"'");
      }

// Logout the user from the server. This releases the resource allocated on the server for the user.
      public void cleanup() 
      {
            server.logout();
            System.out.println("User '" +server.getUser()+ "' logged out.");
      }
}
