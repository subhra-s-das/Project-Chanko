package UserData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class Example {

	public static void main(String[] args) {
		
		testClass test = new testClass();
		test.setConn("Demo", "jdbc:arserver://vw-pun-atm-dv18:0;mode=new", "", "SELECT  `HPD:Help Desk`.`Status`,`HPD:Help Desk`.`Company`   from  `AR System Schema`.`HPD:Help Desk`");
ArrayList<String> array1 = test.getarray();

System.out.println(array1);
}
}


class testClass
{
	String user;
	String url;
	String password;
	String sql;
	String z;
	
	// set method, set the connection parameters
	
	public void setConn (String x, String y, String z, String q)
	{
		user =x;
		url=y;
		password=z;
		sql=q;
	}
	
	// get method, get the arraylist object
	
	public ArrayList<String> getarray ()
	{
		ArrayList<String> arraylist = new ArrayList<String>();
	
		
//		com.bmc.arsys.jdbc.core.Driver
		try {
			Class.forName("com.bmc.arsys.jdbc.core.Driver");
			
			
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement st = conn.createStatement();
			ResultSet rs1 = st.executeQuery(sql);
			
			
//			System.out.println(rs1);
			
			
			ResultSetMetaData metadata = rs1.getMetaData();
		int ColumnCount = metadata.getColumnCount();
			
			HashMap<Integer, ArrayList<String>> hashmap = new HashMap<Integer, ArrayList<String>>();
			while (rs1.next())
			{
				for (int i=1;i<=ColumnCount;i++)
				{
//					System.out.println(rs1.getString(i));
					arraylist.add(rs1.getString(i));
					hashmap.put(1, arraylist);
				}
				
			}	
			String Result;
			for (int j=0;j<arraylist.size();j++)
			{
				Result = arraylist.get(j);
//				System.out.println(Result);
		
//			System.out.println(Result);
			}
//			System.out.println(hashmap.get(1));
			
//					
		} 
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arraylist;
		
		
		
		
		
		
		
	}
}