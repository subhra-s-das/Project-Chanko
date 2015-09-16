package UserData;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadJXL {

	public static void main(String[] args) {
		
	try {		
	Workbook workbook = Workbook.getWorkbook(new File("src/Query.xls"));
	Sheet sheet = workbook.getSheet(0);
	int rowCount=sheet.getRows();

	Map<String, String> hashmap = new HashMap<String, String>();

	for (int i=0;i<rowCount;i++)
	{
		
//		sheet.getCell(0, i); 
		/* 1st cell is 	A1=00	B1=10	C1=20
		 *				A2=01	B2=11	C2=21
		 * 				A3=02	B3=12	C3=22
		 */	
		Cell rowObj1 =sheet.getCell(0, i);		// Cell interface , Sheet Interface
		Cell rowObj2 = sheet.getCell(1, i);

		hashmap.put(rowObj1.getContents(), rowObj2.getContents());
		
//		System.out.println(rowObj1.getContents());
//		System.out.println(rowObj2.getContents());
		

		}
	
	
	// method getContents() returns string. Convert string to int
	int i;
	String y = null;
	for (i=1;i<rowCount;i++)
	{
		y = Integer.toString(i);
		System.out.println(hashmap.get(y));
	}	
//	System.out.println(y);

	
	
	
	
	
	

	
//	String abc ="1";
//	String xyz = "test_String";
//	hashmap1.put("1", "xyz");
//	System.out.println(hashmap1.get("1"));
	
		
	
	} catch (BiffException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	
	
	}

}
