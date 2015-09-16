/*package UserData;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.bmc.arsys.api.Field;

import javax.swing.ListModel;

import com.bmc.arsys.api.*;
import com.bmc.artestdata.qa.ARConnection;


public class GetFieldName extends ARConnection { // this is a extended class

	
	public static void main(String[] args) {
		arConn();
		
 try {

	 List<Field> fieldList= arserver.getListFieldObjects("CTM:People");
	 

		 for (int i=0;i<fieldList.size();i++)
		 {
			 System.out.println( fieldList.get(i).getName());
			 System.out.println( fieldList.get(i).
					 getFieldID());
		 }
	 ;
	 
	
	
	 
	} catch (ARException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}

}
*/