package pckge;

import org.testng.annotations.Test;

public class HomeLoan {
	@Test
	public void webLogin()
	{
		System.out.println("home laon webLogin");
	}
	@Test
	public void MobileLogin()
	{
		System.out.println("home loan mobile Login");
	}
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("I will execute first");
	}
	
}
