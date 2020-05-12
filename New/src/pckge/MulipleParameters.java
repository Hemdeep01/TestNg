package pckge;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MulipleParameters {

	
	@Test(dataProvider="getData") 
	public void bye(String username, String passwod)
	{
		System.out.println("test 2");  
		System.out.println(username="username");
		System.out.println(passwod="password");
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] object= new Object[3][2];
		
		object[0][0]="username1";
		object[0][1]="Password1";
		
		object[1][0]="username2";
		object[1][1]="Password2";
		
		object[2][0]="username3";
		object[0][2]="Password3";
		
		return object;
				
	}
}
