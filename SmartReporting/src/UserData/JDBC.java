package UserData;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.w3c.dom.ls.LSInput;
 
public class JDBC {

	public static void main(String[] args) {

		String user="Demo";
		String url="jdbc:arserver://vl-pun-atm-qa12:0;mode=new";
		String password="bmcAdm1n";
//		String sql="select Incident_Number,Submit_Date from HPD_Help_Desk";
		String sql1="SELECT  `HPD:Help Desk`.`Company`   from  `AR System Schema`.`HPD:Help Desk`";


		try {
			Class.forName("com.bmc.arsys.jdbc.core.Driver");
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement st = conn.createStatement();
			ResultSet rs1 = st.executeQuery(sql1);

			ResultSetMetaData metadata = rs1.getMetaData();
HashMap<Integer, ArrayList<String>> hashmap = new HashMap<Integer, ArrayList<String>>();		





			ArrayList<String> arrayList = new ArrayList<String>();
			while(rs1.next())
			{
				int i=1;
				int a =1; // hashmp key
				for (a=1;a<metadata.getColumnCount();a++);
				{
				
				while (i<metadata.getColumnCount())
				{
				arrayList.add(rs1.getString(i++));
//				System.out.println(a);
				hashmap.put(a, arrayList);
				
				}
				}
				}

			System.out.println(hashmap.get(2));
//			System.out.println(arrayList.size());
//			System.out.println(arrayList.get(55));
	
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
		
		HashMap<String, ArrayList<String>> hashmap = new HashMap<String, ArrayList<String>>();
		ArrayList<String> arraylist1 = new ArrayList<String>();
		ArrayList<String> arraylist2 = new ArrayList<String>();
		
		String u = "C";
		String s = "A";	
		String t = "B";
		int a =0;
		
		for (a=0;a<=20;a++)
		{	
		arraylist1.add(s+a);			// adding elements and index in arraylist
		hashmap.put(u+a, arraylist1);	// adding key and value key = string value = Arraylist<E>
		arraylist2.add(a, t+a);
		hashmap.put(t+a, arraylist2);
		}
		
//		System.out.println(arraylist1.get(20));
//		System.out.println(arraylist2.get(20));
//		System.out.println(hashmap.get("C1"));
//		System.out.println(hashmap.get("B1"));
		

	}
}


