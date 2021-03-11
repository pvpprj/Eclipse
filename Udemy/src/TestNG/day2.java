package TestNG;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class day2 {

	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHomeLoan");
	}
	
	@Test
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHomeLoan");
	}
	
	@Test(groups= {"smoke"})
	public void ChromeLoginHomeLoan()
	{
		System.out.println("ChromeLoginHomeLoan");
	}
	
	@BeforeTest
	public void Before()
	{
		System.out.println("1st execute Home Losan");
	}
		
	
}
