package pckge;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	
	@Parameters({"URL","Username"})
	@Test(groups="smoke")
	public void webLogin(String urlname, String Username)
	{
		System.out.println("webLogin");
		System.out.println("url="+urlname);
		System.out.println("username="+ Username);
	}
	@Test(groups="smoke")
	public void MobileLogin()
	{
		System.out.println("mobile Login");
	}

}
