package UserData;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;



public class ReadQuery {
	
	public static void main(String[] args)
	{

		HashMap<String, String> map = new  HashMap <String, String>();
		
	
		
		File file = new File("src/Query.txt");
		
		try {
			Scanner scanner = new Scanner(file);
			
			while (scanner.hasNext())
			{
				 String t1 = scanner.nextLine();
				 String t2 = scanner.nextLine();
				 

			}


			
			scanner.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
		
	}
}




