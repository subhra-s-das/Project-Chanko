/*package UserData;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.bmc.arsys.api.ARException;
import com.bmc.arsys.api.Field;
import com.bmc.artestdata.qa.ARConnection;

public class GetField extends ARConnection {

	public static void main(String[] args) {
		
		//AR server connection method
		arConn();
	System.out.println("Connecting to ARServer "+arserver.getServer());
	
	
	try {
		List<Integer> ListField= arserver.getListField("CTM:People", 0, 0);
		for(int i=0;i<ListField.size();i++)
		{
			System.out.println(ListField.get(i));
			
		} 
	} catch (ARException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}

*/