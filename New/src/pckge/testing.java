package pckge;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testing {
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hem\\Desktop\\SELENIUM\\Selenium Again\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("rocking_hem@yahoo.in");
		driver.findElement(By.name("pass")).sendKeys("Libra01");
		//driver.findElement(By.id("u_0_b")).click();
		driver.findElement(By.linkText("Forgot account?")).click();
		
	}

}
