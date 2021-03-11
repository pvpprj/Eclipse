package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=1)
	public void WebLoginPersonalLoan()
	{
		System.out.println("WebLoginPersonalLoan");
	}
	
	@Test(priority=2)
	public void MobileLoginPersonalLoan()
	{
		System.out.println("MobileLoginPersonalLoan");
	}
	
	@Test(priority=3)
	public void ChromeLoginPersonalLoan()
	{
		System.out.println("ChromeLoginPersonalLoan");
	}
	
	@Test (priority=0)
	public void zChromeLoginPersonalLoan()
	{
		System.out.println("zzzzz");
	}
	
	@BeforeTest
	public void Before()
	{
		System.out.println("1st execute PersonaLoan");
	}
	} 