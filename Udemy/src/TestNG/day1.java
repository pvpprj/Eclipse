package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	
	@Test(groups= {"smoke"})
	public void WebLoginPersonalLoan()
	{
		System.out.println("WebLoginPersonalLoan");
	}
	
	@Test
	public void MobileLoginPersonalLoan()
	{
		System.out.println("MobileLoginPersonalLoan");
	}
	
	@Test
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
