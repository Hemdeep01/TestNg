package pckge;

import org.testng.annotations.BeforeTest;

public class Test1 {
	@org.testng.annotations.Test 
	public void demo()
	{
		System.out.println("hey");  
	}
	
	@org.testng.annotations.Test 
	public void bye()
	{
		System.out.println("bye");
		
		
	}
	
	
	@BeforeTest(groups="smoke")
	public void beforetest()
	{
		System.out.println("this is the first test before starting executing test cases");
	}
	
	

}
