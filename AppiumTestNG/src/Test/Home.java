package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class Home {
	
	
	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHomeLoan");
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite");
	}
	
	@Test(groups="smoke")
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHomeLoan");
	}

	@Test
	public void ApiLoginHomeLoan()
	{
		System.out.println("ApiLoginHomeLoan");
	}

	
}
