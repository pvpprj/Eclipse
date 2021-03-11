package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Personal {
	
	@Parameters({"URL","KEY"})
	@Test
	public void WebLoginPersonalLoan(String d,String f)
	{
		System.out.println("WebLoginPersonalLoan");
		System.out.println(d);
		System.out.println(f);
	}
	
	/*@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
	}  */
	
	@Test(groups="smoke")
	public void MobileLoginPersonalLoan()
	{
		System.out.println("MobileLoginPersonalLoan");
	}

	@Test
	public void MobileSignInPersonalLoan()
	{
		System.out.println("MobileSignInPersonalLoan");
		
	}
	
	@Test(enabled=false)
	public void MobileLogOutPersonalLoan()
	{
		System.out.println("MobileLogOutPersonalLoan");
	}
	
	@Test
	public void ApiZLoginPersonalLoan()
	{    
		System.out.println("aaaaa");
	}
	
	@Test(dependsOnMethods= {"ApiZLoginPersonalLoan"})
	public void ApiLoginPersonalLoan()
	{
		System.out.println("ApiLoginPersonalLoan");
	}

	

}
